package com.exercise.springbootinit.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.springbootinit.entity.Product;
import com.exercise.springbootinit.service.IService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping ("/products")
public class ProductController {
	
	@Autowired
	private IService<Product> productService;
	
	@GetMapping("/")
	public List<Product> listProducts(){
		return productService.findAll();
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Long id) {
		return productService.findById(id);
	}

}
