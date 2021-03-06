package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/endpoint")
	String endpoint() {
		return "Hello from IBM Cloud deployment!\n";
	}

	@GetMapping("/welcome")
	String welcome() {
		return "Welcome to XlinkData from IBM Cloud deployment!\n";
	}

	@GetMapping("/hello")
	String hello() {
		return "Hello from XlinkData from IBM Cloud deployment!\n";
	}
}
