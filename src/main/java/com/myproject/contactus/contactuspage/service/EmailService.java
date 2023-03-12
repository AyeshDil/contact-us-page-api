package com.myproject.contactus.contactuspage.service;

public interface EmailService {
    boolean createEmail(String to, String subject, String body);
}
