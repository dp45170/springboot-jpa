package com.examples.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.examples.domain.Customers;
import com.examples.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<List<Customers>> allCustomers() {
		return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> customerById(@PathVariable("id")Integer id) {
		try {
			
			return new ResponseEntity<>(customerService.getById(id),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Record Not Found", HttpStatus.OK);
		}
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void saveCustomer(@RequestBody Customers customers){
		
		Customers c = customerService.saveCusotmers(customers);
		
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public void updateCustomer(@RequestBody Customers customers) {
		Customers c = customerService.updateCustomer(customers);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void deleteCustomer(@RequestBody Customers customers) {
		customerService.deleteCustomer(customers);
	}

}
