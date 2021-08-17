package com.knockoff.product.core.repository;

import com.knockoff.product.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
