package com.starter.models.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.starter.models.entities.Product;

// DAO (Data Access Object)
public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);

}
