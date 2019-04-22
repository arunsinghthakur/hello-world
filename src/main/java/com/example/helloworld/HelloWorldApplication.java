package com.example.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@GetMapping
	public String sayHello() {
		logger.info("New request has been received." + System.currentTimeMillis());
		return "Hello world. JOKER";
	}

}
