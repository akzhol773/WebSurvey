package com.akzholbek.websurvey.service.serviceImpl;

import com.akzholbek.websurvey.dto.ProductDto;
import com.akzholbek.websurvey.entity.Product;
import com.akzholbek.websurvey.exception.EntityNotFoundException;
import com.akzholbek.websurvey.mapper.ProductMapper;
import com.akzholbek.websurvey.repository.ProductRepository;
import com.akzholbek.websurvey.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public List<ProductDto> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::productToProductDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto findById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product not found with id: " + id));
        return productMapper.productToProductDto(product);
    }

    @Override
    public Product save(ProductDto productDto) {
        return productRepository.save(productMapper.productDtoToProduct(productDto));
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
