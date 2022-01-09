package com.exercise.springbootinit.service;

import java.util.List;

public interface IService<T> {

	List<T> findAll();
	T findById (Long id);
	
}
