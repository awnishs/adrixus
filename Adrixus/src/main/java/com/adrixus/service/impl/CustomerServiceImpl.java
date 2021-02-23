package com.adrixus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrixus.domain.Customer;
import com.adrixus.repository.CustomerRepository;
import com.adrixus.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	  @Autowired 
	  CustomerRepository customerRepository;
	 
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		customer = customerRepository.save(customer);
		return customer;
	}

}
