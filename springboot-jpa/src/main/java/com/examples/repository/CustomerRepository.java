package com.examples.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examples.domain.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

	@Query(value = "select c.* from customers c join address a on c.customerId = a.customerId", nativeQuery = true)
	List<Customers> customersWithAddress();
	
}
