package com.myproject.contactus.contactuspage.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FormDataRequestDTO {
    private String userName;
    private String email;
    private String phoneNumber;
    private String subject;
    private String message;
}
