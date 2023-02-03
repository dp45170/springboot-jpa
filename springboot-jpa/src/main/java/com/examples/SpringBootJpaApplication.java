package com.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.domain.Customers;
import com.examples.domain.Orders;
import com.examples.service.CustomerService;
import com.examples.service.OrderService;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		List<Customers> customers = customerService.findAll();
		System.out.println(customers.size());
		customers.forEach(System.out::println);
		customers = customerService.withAddress();
		System.out.println(customers.size());
		customers.forEach(System.out::println);
		List<Orders> orders = orderService.findAll();
		System.out.println(orders.size());
		orders.forEach(System.out::println);
		
	}

}
