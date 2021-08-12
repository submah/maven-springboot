package com.demo.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@InjectMocks
	private HelloWorldController hello;
	@Test
	public void testHelloWorld() {
		String hello1 = hello.helloWorld();
		Assertions.assertEquals("Hello World from Springboot", hello1);
		} 
	}


