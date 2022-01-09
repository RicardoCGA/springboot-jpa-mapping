package com.exercise.springbootinit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.springbootinit.entity.Category;
import com.exercise.springbootinit.service.IService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/category")
public class CategoryController {

	private IService<Category> service;
	
	@GetMapping("/")
	public List<Category> getAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Category findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
}
