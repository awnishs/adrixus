package com.adrixus.controller;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrixus.domain.Customer;
import com.adrixus.response.CustomerResponse;
import com.adrixus.service.CustomerService;

@RestController
@RequestMapping("/assignment")
public class CustomerController {

	LinkedHashMap<String, String> mapOfString = new LinkedHashMap<String, String>();

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/createCustomer")
	private CustomerResponse createCustomer(@RequestBody Customer customer) {
		mapOfString.clear();
		
		try {
		customer = customerService.createCustomer(customer);
		
		mapOfString.put("status", "1");
		mapOfString.put("message", "Successfully Created Customer");

		}catch(Exception ex) {
			mapOfString.clear();
			mapOfString.put("status", "0");
			mapOfString.put("message", "failed");
			mapOfString.put("error", ex.getLocalizedMessage());
			return new CustomerResponse(mapOfString, null);

		}
		return new CustomerResponse(mapOfString, customer);
	}
}
