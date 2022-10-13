package com.facilityDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SportFacilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportFacilityApplication.class, args);
	}

}
