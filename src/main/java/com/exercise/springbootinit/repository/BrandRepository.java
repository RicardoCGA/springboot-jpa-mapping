package com.exercise.springbootinit.repository;

import org.springframework.data.repository.CrudRepository;

import com.exercise.springbootinit.entity.Brand;

public interface BrandRepository extends CrudRepository<Brand, Long> {

}
