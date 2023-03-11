package com.myproject.contactus.contactuspage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "form_data_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FormData {
    @Id
    @Column(name = "property_id")
    private String propertyId;
    @Column(name = "user_name", length = 200)
    private String userName;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
    @Column(name = "subject", length = 50)
    private String subject;
    @Column(name = "message", length = 700)
    private String message;

}
