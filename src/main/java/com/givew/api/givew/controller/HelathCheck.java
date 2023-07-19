package com.givew.api.givew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelathCheck {
	
	@GetMapping("/api")
	public String getHealth() {
		return "App is running";
	}

}
