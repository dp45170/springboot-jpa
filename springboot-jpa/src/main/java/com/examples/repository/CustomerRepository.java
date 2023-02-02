package com.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.domain.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
