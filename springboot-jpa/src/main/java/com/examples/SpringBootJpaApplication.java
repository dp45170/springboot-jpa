package com.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examples.domain.Customers;
import com.examples.domain.Orders;
import com.examples.domain.Products;
import com.examples.service.CustomerService;
import com.examples.service.OrderService;
import com.examples.service.ProductService;

@SpringBootApplication
public class SpringBootJpaApplication {// implements CommandLineRunner {
	
//	@Autowired
//	private CustomerService customerService;
//	
//	@Autowired
//	private OrderService orderService;
//	
//	@Autowired
//	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);

	}

	/*
	 * @Override public void run(String... args) throws Exception { List<Customers>
	 * customers = customerService.findAll(); System.out.println(customers.size());
	 * customers.forEach(System.out::println); customers =
	 * customerService.withAddress(); System.out.println(customers.size());
	 * customers.forEach(System.out::println); List<Orders> orders =
	 * orderService.findAll(); System.out.println(orders.size());
	 * orders.forEach(System.out::println);
	 * 
	 * List<Products> products = productService.findAll();
	 * System.out.println(products.size()); products.forEach(System.out::println);
	 * 
	 * Products p = productService.findById(1001); System.out.println(p);
	 * 
	 * }
	 */

}
