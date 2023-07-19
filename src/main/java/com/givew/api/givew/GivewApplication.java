package com.givew.api.givew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GivewApplication {

	public static void main(String[] args) {
		SpringApplication.run(GivewApplication.class, args);
		
		System.out.println("Givew App is running.");
	}

}
