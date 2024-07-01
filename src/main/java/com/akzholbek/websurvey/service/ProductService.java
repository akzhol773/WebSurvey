package com.akzholbek.websurvey.service;

import com.akzholbek.websurvey.dto.ProductDto;
import com.akzholbek.websurvey.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDto> findAll();
    ProductDto findById(Long id);

    Product save(ProductDto productDto);

    void deleteById(Long id);
}
