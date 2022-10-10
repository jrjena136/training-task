package com.example.demo.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@GetMapping("/get")
	public String get() {
		String msgString = "Welcome Friends";

		int len = msgString.length();

		return msgString + "length is " + len;
	}

	@PostMapping(path = "/add",	consumes= {"application/json"},produces = {"application/xml"})
	public Customer addCustomer(@RequestBody Customer customer) {

		System.out.println(customer);
		return customer;

	}
	/*
	 * @ExceptionHandler(value = NullPointerException.class)
	 * //@ResponseStatus(reason = "Null Value Found,exception occur")
	 * 
	 * @ResponseStatus(code = HttpStatus.BAD_REQUEST,reason =
	 * "Null Value Found,exception occur") public void exceptionHandler() {
	 * 
	 * }
	 * 
	 * 
	 * @ExceptionHandler(value = ArithmeticException.class) public
	 * ResponseEntity<String> exceptionHandler2() { return new
	 * ResponseEntity<String>("Sorry number can't be divided",HttpStatus.
	 * NOT_ACCEPTABLE);
	 * 
	 * }
	 */
	 
}
