package com.cst438.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@PostMapping("/student")
	public String createNewStudent() {
		return "student ID = 12345";
	}
	

}
