package com.exercise.springbootinit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.springbootinit.entity.Brand;
import com.exercise.springbootinit.service.IService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/brand")
@AllArgsConstructor
public class BrandController {

	private IService<Brand> service;
	
	@GetMapping("/")
	public List<Brand> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Brand findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
}
