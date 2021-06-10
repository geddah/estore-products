package com.knockoff.estore.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.knockoff.estore.domain.Product;
import com.knockoff.estore.service.ProductService;

@Component
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	ProductService productService;
	
	public Product getProduct(String id) {
		return productService.getProduct(id);
		
		
		
		
	}
	

}
