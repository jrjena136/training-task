package com.example.demo.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> handler() {
		return new ResponseEntity<String>("Some error occur",HttpStatus.BAD_REQUEST);
		
	}

}
