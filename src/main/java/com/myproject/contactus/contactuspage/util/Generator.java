package com.myproject.contactus.contactuspage.util;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Generator {

    private static String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//    private static String numbers ="1234567890";

    public String generatePropertyId(int length){
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(characters.charAt(new Random().nextInt(characters.length()-1)));
        }

        return builder.toString();
    }
}
