package com.knockoff.estore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knockoff.estore.controller.exception.RecordNotFoundException;

@RestController
public class ProductController {

	@GetMapping
	public String something() throws RecordNotFoundException {
		int c = 0;
		try {
			int a = 10;
			int b = 0;
			c = a/b;
		} catch (ArithmeticException e) {
			//throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "you can divide 0 times, Dummy", e);
			throw new NullPointerException();
		}
		return String.valueOf(Integer.valueOf(c));
	}
	
}
