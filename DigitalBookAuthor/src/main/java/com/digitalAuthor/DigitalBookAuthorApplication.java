package com.digitalAuthor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DigitalBookAuthorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalBookAuthorApplication.class, args);
	}

}
