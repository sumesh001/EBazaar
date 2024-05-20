package com.sky.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sky.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>
{
	public Product findByPname(String name);

}
