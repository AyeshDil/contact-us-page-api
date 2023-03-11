package com.myproject.contactus.contactuspage;

import com.myproject.contactus.contactuspage.util.Generator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContactUsPageApplicationTests {

	@Test
	void contextLoads() {

		Generator generator = new Generator();
		String s = generator.generatePropertyId(5);
		System.out.println(s);
	}



}
