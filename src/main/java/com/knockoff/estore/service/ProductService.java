package com.knockoff.estore.service;

import org.springframework.stereotype.Service;

import com.knockoff.estore.domain.Product;
@Service
public class ProductService {

	public Product getProduct(String id) {
		Product p1 = new Product();
		
		p1.setCategory("abc");
		p1.setDescription("good");
		p1.setMake("v1");
		p1.setModel("v2");
		p1.setName("v3");
		p1.setPrice(30);
		p1.setProduct_id("20");
		p1.setStock(2);
		return p1;
		
	}

}
