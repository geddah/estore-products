package com.knockoff.product.core.service;

import com.knockoff.product.core.repository.ProductRepository;
import com.knockoff.product.domain.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return Collections.singletonList(productOptional.get());
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        Optional<Product> productOptional = productRepository.findById(product.getProductId());

        if (productOptional.isPresent()) {
            productRepository.save(product);
        } else {
            log.error("Product does not exist");
        }

        return product;
    }

    public void deleteProduct(Product product){
        productRepository.delete(product);
    }
}
