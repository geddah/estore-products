package com.knockoff.product.core.controller.exception;

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
