package com.myproject.contactus.contactuspage.repo;

import com.myproject.contactus.contactuspage.entity.FormData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface FormDataRepo extends JpaRepository<FormData, String> {
}
