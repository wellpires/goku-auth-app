package com.goku.auth.controller.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.goku.auth.builder.ErrorResponseBuilder;
import com.goku.auth.response.ErrorResponse;

@RestControllerAdvice
public class AuthenticationControllerAdvice {

	private static final Logger logger = LoggerFactory.getLogger(AuthenticationControllerAdvice.class);

	@Value("${message.error-generic}")
	private String message;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception exception) {

		logger.error(exception.getMessage(), exception);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new ErrorResponseBuilder().message(message).build());
	}

}
