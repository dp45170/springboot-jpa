package com.examples.service;

import java.util.List;
import java.util.Optional;

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
	
	public List<Customers> withAddress() {
		return customerRepository.customersWithAddress();
	}
	
	public Customers getById(Integer id) {
		Customers c = null;
		Optional<Customers> optional = customerRepository.findById(id);
		if(optional.isPresent()) {
			c = optional.get();
		} else {
			System.out.println("Record Not Found");
			throw new RuntimeException("Record Not Found");
		}
		return c;
	}
	
	public Customers saveCusotmers(Customers customers) {
		return customerRepository.saveAndFlush(customers);
	}

}
