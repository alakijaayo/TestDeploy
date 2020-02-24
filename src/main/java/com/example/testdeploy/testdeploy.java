package com.example.testdeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class testdeploy {
	
	public static void main(String[] args) {
		SpringApplication.run(testdeploy.class, args);
	}

}
