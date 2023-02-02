package com.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.domain.Customers;
import com.examples.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customers> findAll() {
		//customers and apply business logic
		return customerRepository.findAll();
	}

}
