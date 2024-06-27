package com.akzholbek.websurvey.service;

import com.akzholbek.websurvey.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);

    Product save(Product product);

    void deleteById(Long id);
}
