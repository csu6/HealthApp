package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HealthApplication {

	@GetMapping("/")
	String home() {
		return "Hello world. This is a health application!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HealthApplication.class, args);
	}
}
