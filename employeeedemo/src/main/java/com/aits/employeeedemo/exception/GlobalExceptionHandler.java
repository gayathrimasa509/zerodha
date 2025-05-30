package com.aits.employeeedemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> handleEmployeeNotFound(EmployeeNotFound e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(HikeIsInvalidException.class)
	public ResponseEntity<String> handleEmployeeNotFound(HikeIsInvalidException e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}
