package com.aits.security;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
 
@RestController

public class TestController {
 
	@GetMapping("/")

	public String check() {

		return "Welcome";

	}


}

 
