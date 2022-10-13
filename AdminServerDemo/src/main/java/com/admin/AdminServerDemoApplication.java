package com.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class AdminServerDemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(AdminServerDemoApplication.class, args);
	}


}
