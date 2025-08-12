package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	@GetMapping("/get")
	public String getMessage() {
		return "Wel come to first jenkins";
	}

}
