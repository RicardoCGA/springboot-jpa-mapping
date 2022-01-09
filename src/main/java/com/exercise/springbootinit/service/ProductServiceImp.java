package com.exercise.springbootinit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.springbootinit.entity.Product;
import com.exercise.springbootinit.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImp implements IService<Product> {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAll() {

		return (List<Product>)productRepository.findAll();
	}

	@Override
	public Product findById(Long id) {

		return productRepository.findById(id).orElse(null);
		
	}
	
	

	
	
}
