package com.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.domain.Customers;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		List<Customers> customers = customerService.findAll();
		System.out.println(customers.size());
		
	}

}
