package com.givew.api.givew.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.givew.api.givew.model.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@GetMapping("/users/user")
	public ResponseEntity<User> getUserTest(){
		User newUser = new User("Brang" , "Mai");
		return ResponseEntity.status(200).body(newUser);
	}
	

}
