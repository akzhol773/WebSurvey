package com.akzholbek.websurvey.mapper;

import com.akzholbek.websurvey.dto.ProductDto;
import com.akzholbek.websurvey.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class ProductMapper {
    public  ProductDto productToProductDto(Product product) {
        if (product == null) {
            return null;
        }

        return new ProductDto(product.getId(), product.getName(), product.getDescription());
    }

    public Product productDtoToProduct(ProductDto productDto) {
        if (productDto == null) {
            return null;
        }

        Product product = new Product();
        product.setId(productDto.id());
        product.setName(productDto.name());
        product.setDescription(productDto.description());
        return product;
    }
}
