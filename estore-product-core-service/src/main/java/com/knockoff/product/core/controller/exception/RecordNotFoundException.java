package com.knockoff.product.core.controller.exception;

//@ResponseStatus(reason = "this is the reason from Exception class", code = HttpStatus.ALREADY_REPORTED)
public class RecordNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String message;
	private String reason;

	public RecordNotFoundException(String message, String reason) {
		super(message);
		this.reason = reason;
		this.message = message;
	}

	public String getReason() {
		return reason;
	}

	public String getMessage() {
		return message;
	}

}
