package com.myproject.contactus.contactuspage.service;

import org.springframework.core.io.FileSystemResource;

public interface EmailService {
    boolean createEmail(String to, String subject, String body);
}
