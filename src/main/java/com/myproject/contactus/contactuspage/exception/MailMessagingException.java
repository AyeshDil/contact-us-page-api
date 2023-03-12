package com.myproject.contactus.contactuspage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class MailMessagingException extends RuntimeException {
    public MailMessagingException(String message){
        super(message);
    }
}
