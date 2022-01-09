package com.exercise.springbootinit.repository;

import org.springframework.data.repository.CrudRepository;

import com.exercise.springbootinit.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>  {
}
