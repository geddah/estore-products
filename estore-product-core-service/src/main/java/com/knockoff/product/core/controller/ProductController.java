package com.knockoff.product.core.controller;

import com.knockoff.product.core.service.ProductService;
import com.knockoff.product.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.knockoff.product.core.controller.exception.RecordNotFoundException;

import java.util.List;

@RestController(value = "/v1/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product createProduct(@RequestBody Product product){
		return productService.saveProduct(product);
	}

	@GetMapping(value = "/{productId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProduct(@PathVariable Long productId){
		return productService.getProducts(productId);
	}

	@PutMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product updateProduct(@RequestBody Product product){
		return productService.updateProduct(product);
	}

	@DeleteMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteProduct(@RequestBody Product product){
		productService.deleteProduct(product);
	}
	
}
