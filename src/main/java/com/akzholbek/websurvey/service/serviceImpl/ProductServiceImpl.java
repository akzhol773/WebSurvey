package com.akzholbek.websurvey.service.serviceImpl;

import com.akzholbek.websurvey.repository.ProductRepository;
import com.akzholbek.websurvey.service.ProductService;
import lombok.AllArgsConstructor;
import com.akzholbek.websurvey.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
