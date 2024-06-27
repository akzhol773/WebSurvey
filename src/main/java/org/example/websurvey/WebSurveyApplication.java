package org.example.websurvey;

import lombok.AllArgsConstructor;
import org.example.websurvey.entity.Product;
import org.example.websurvey.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class WebSurveyApplication implements CommandLineRunner {
    private final ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(WebSurveyApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Create
        Product product = new Product();
        product.setName("Test Product");
        product.setDescription("This is a test product");

        // Save
        product = productService.save(product);
        System.out.println("Saved product: " + product);

        // Find
        Product foundProduct = productService.findById(product.getId()).orElse(null);
        System.out.println("Found product: " + foundProduct);

        // Update
        if (foundProduct != null) {
            foundProduct.setDescription("Updated description");
            productService.save(foundProduct);
            System.out.println("Updated product: " + foundProduct);
        }

        // Delete
        if (foundProduct != null) {
            productService.deleteById(foundProduct.getId());
            System.out.println("Deleted product with ID: " + foundProduct.getId());
        }
    }
}


