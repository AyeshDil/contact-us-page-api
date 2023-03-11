package com.myproject.contactus.contactuspage.controller;

import com.myproject.contactus.contactuspage.dto.request.FormDataRequestDTO;
import com.myproject.contactus.contactuspage.dto.response.CommonResponseDTO;
import com.myproject.contactus.contactuspage.service.FormDataService;
import com.myproject.contactus.contactuspage.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/form-data")
public class FormDataController {

    private final FormDataService formDataService;

    @Autowired
    public FormDataController(FormDataService formDataService) {
        this.formDataService = formDataService;
    }

    @PostMapping(value = {"/save"})
    public ResponseEntity<StandardResponse> saveContactData(@RequestBody FormDataRequestDTO formDataRequestDTO){
        CommonResponseDTO commonResponseDTO = formDataService.saveNewContactData(formDataRequestDTO);
        return new ResponseEntity<>(
                new StandardResponse(
                        commonResponseDTO.getCode(),
                        commonResponseDTO.getMessage(),
                        commonResponseDTO.getData()
                ), HttpStatus.CREATED
        );
    }
}
