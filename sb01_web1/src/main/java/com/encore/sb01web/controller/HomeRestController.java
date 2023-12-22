package com.encore.sb01web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping("/") // http://localhost:8080/
//	@GetMapping("/")
	public String homePlain() {
		return "<h1>Welcome Spring Boot!</h1>";
	}
}
