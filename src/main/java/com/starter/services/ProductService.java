package com.starter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starter.models.entities.Product;
import com.starter.models.repositories.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product) {
        return productRepo.save(product);
    }

    public Product findOne(Long id) {
        Optional<Product> tempProduct = productRepo.findById(id);
        if (!tempProduct.isPresent()) { // kalau ada
            return null;
        }
        return tempProduct.get();

    }

    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    public void removeOne(Long id) {
        productRepo.deleteById(id);
    }

    public List<Product> findByNameContains(String name) {
        return productRepo.findByNameContains(name);
    }

}
