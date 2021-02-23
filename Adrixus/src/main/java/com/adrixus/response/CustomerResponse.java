package com.adrixus.response;

import java.util.LinkedHashMap;

import com.adrixus.domain.Customer;

public class CustomerResponse {

	private LinkedHashMap<String, String> status = new LinkedHashMap<String, String>();
	private Customer customer;
	public CustomerResponse(LinkedHashMap<String, String> status, Customer customer) {
		super();
		this.status = status;
		this.customer = customer;
	}
	public CustomerResponse() {
	}
	public LinkedHashMap<String, String> getStatus() {
		return status;
	}
	public void setStatus(LinkedHashMap<String, String> status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
