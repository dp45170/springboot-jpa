package com.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.domain.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
