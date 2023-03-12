package com.myproject.contactus.contactuspage.service.impl;

import com.myproject.contactus.contactuspage.dto.request.FormDataRequestDTO;
import com.myproject.contactus.contactuspage.dto.response.CommonResponseDTO;
import com.myproject.contactus.contactuspage.entity.FormData;
import com.myproject.contactus.contactuspage.exception.ConflictException;
import com.myproject.contactus.contactuspage.repo.FormDataRepo;
import com.myproject.contactus.contactuspage.service.EmailService;
import com.myproject.contactus.contactuspage.service.FormDataService;
import com.myproject.contactus.contactuspage.util.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        // send email to user

        String body

        boolean isSentEmail = emailService.createEmail(
                formDataRequestDTO.getEmail(),
                "Contact Us",
                ""
        );


        return new CommonResponseDTO(
                200,
                "Details Saved!",
                "We will contact you"
        );
    }
}
