package com.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.domain.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
