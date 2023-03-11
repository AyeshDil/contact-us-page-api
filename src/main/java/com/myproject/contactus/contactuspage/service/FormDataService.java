package com.myproject.contactus.contactuspage.service;

import com.myproject.contactus.contactuspage.dto.request.FormDataRequestDTO;
import com.myproject.contactus.contactuspage.dto.response.CommonResponseDTO;

public interface FormDataService {
    CommonResponseDTO saveNewContactData(FormDataRequestDTO formDataRequestDTO);
}
