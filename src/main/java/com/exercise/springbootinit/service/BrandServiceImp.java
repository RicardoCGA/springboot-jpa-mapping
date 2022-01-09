package com.exercise.springbootinit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exercise.springbootinit.entity.Brand;
import com.exercise.springbootinit.repository.BrandRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandServiceImp implements IService<Brand>{

	private BrandRepository repository; 
	
	@Override
	public List<Brand> findAll() {
		return (List<Brand>) repository.findAll();
	}

	@Override
	public Brand findById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
