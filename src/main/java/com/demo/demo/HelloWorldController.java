package com.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
	@GetMapping("/health")
	public String helloWorld() {
		System.out.println("Hello World from Springboot");
		return "Hello World from Springboot";
	}
}
