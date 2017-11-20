package com.bugTracking;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugTracking.dao.CustomerRepository;

@Controller
public class WelcomeController {

	private String MESSAGE = "Hello Akshay";

	private String TITLE = "Programmer";

	@Autowired
	DataSource dataSource;

	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("title", TITLE);
		model.put("message", MESSAGE);

		String name = "Akshay";
		String email = "asdad@asd.com";
		customerRepository.addCustomer(name, email);
		System.out.println("Done!");

		return "welcome";
	}


}