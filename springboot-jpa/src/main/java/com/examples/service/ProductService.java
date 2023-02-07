package com.examples.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.domain.Products;
import com.examples.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> findAll() {
		return productRepository.findAll();
	}
	
	public Products findById(Integer id) {
		Optional<Products> optProducts = productRepository.findById(id);
		if(optProducts.isPresent()) {
			return optProducts.get();
		} else {
			return null;
		}
	}
	
	public Products storeProducts(Products products) {
		return productRepository.saveAndFlush(products);
	}

}
