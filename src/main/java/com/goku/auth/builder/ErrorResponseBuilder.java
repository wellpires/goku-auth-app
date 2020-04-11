package com.goku.auth.builder;

import com.goku.auth.response.ErrorResponse;

public class ErrorResponseBuilder {

	private String message;

	public ErrorResponseBuilder message(String message) {
		this.message = message;
		return this;
	}

	public ErrorResponse build() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(message);
		return errorResponse;
	}

}
