package com.knockoff.estore.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(reason = "this is the reason from Exception class", code = HttpStatus.ALREADY_REPORTED)
public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String message) {
		super(message);
	}
	
	@Override
	public void printStackTrace() {
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "to string. no stack trace";
	}
	
}
