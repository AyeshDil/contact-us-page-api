package com.myproject.contactus.contactuspage.service.impl;

import com.myproject.contactus.contactuspage.dto.request.FormDataRequestDTO;
import com.myproject.contactus.contactuspage.dto.response.CommonResponseDTO;
import com.myproject.contactus.contactuspage.entity.FormData;
import com.myproject.contactus.contactuspage.exception.ConflictException;
import com.myproject.contactus.contactuspage.exception.ServerErrorException;
import com.myproject.contactus.contactuspage.repo.FormDataRepo;
import com.myproject.contactus.contactuspage.service.EmailService;
import com.myproject.contactus.contactuspage.service.FormDataService;
import com.myproject.contactus.contactuspage.util.Generator;
import com.myproject.contactus.contactuspage.util.HtmlContent;
import org.apache.catalina.webresources.FileResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FormDataServiceIMPL implements FormDataService {

    private final FormDataRepo formDataRepo;
    private final Generator generator;
    private final EmailService emailService;


    @Autowired
    public FormDataServiceIMPL(FormDataRepo formDataRepo, Generator generator, EmailService emailService) {
        this.formDataRepo = formDataRepo;
        this.generator = generator;
        this.emailService = emailService;
    }

    @Override
    public CommonResponseDTO saveNewContactData(FormDataRequestDTO formDataRequestDTO) {

        // send email to user
        String body = new HtmlContent().content();
        boolean isSentEmail = emailService.createEmail(
                formDataRequestDTO.getEmail(),
                "Contact Us",
                body
        );

        if (isSentEmail) {
            // Generate property id
            String generatedId = generator.generatePropertyId(10);

            FormData formData = new FormData(
                    generatedId,
                    formDataRequestDTO.getUserName(),
                    formDataRequestDTO.getEmail(),
                    formDataRequestDTO.getPhoneNumber(),
                    formDataRequestDTO.getSubject(),
                    formDataRequestDTO.getMessage()
            );

            if (formDataRepo.existsById(generatedId)) throw new ConflictException("Try Again!");

            formDataRepo.save(formData);

            // Send user details to the official email.
            String userFullData = "<h2>New user send contact details.</h2>" +
                    "<p>User Id: " + generatedId + "</p>" +
                    "<p>userName: " + formDataRequestDTO.getUserName() + "</p>" +
                    "<p>email: " + formDataRequestDTO.getEmail() + "</p>" +
                    "<p>phoneNumber: " + formDataRequestDTO.getPhoneNumber() + "</p>" +
                    "<p>subject: " + formDataRequestDTO.getSubject() + "</p>" +
                    "<p>message: " + formDataRequestDTO.getMessage() + "</p>";

            emailService.createEmail(
                    "official.onideyak@gmail.com",
                    "User Contact Details",
                    userFullData
            );

            return new CommonResponseDTO(
                    200,
                    "Details Saved!",
                    "We will contact you"
            );

        } else {
            throw new ServerErrorException("Your contact data didn't submitted!");
        }
    }
}
