package com.exercise.springbootinit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exercise.springbootinit.entity.Category;
import com.exercise.springbootinit.repository.CategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImp implements IService<Category>{

	private CategoryRepository repository;
	
	@Override
	public List<Category> findAll() {
		return (List<Category>)repository.findAll();
	}

	@Override
	public Category findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
