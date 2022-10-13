package com.apigate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

import org.springdoc.core.GroupedOpenApi;

@CrossOrigin(origins = "http://localhost:4200")
@EnableDiscoveryClient
@SpringBootApplication
public class ApiGateWayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiGateWayApplication.class, args);
	}

	@Autowired
	RouteDefinitionLocator locator;
	
	@Bean 
	public List<GroupedOpenApi> apis(){
		List<GroupedOpenApi> groups =new ArrayList<>();
		List<RouteDefinition> definitions = locator.getRouteDefinitions().collectList().block();
		assert definitions!= null;
		definitions.stream().filter(routeDefinition -> routeDefinition.getId().matches(".*-service")).forEach(routeDefinition ->{
			String name = routeDefinition.getId().replaceAll("-service", "");
			groups.add(GroupedOpenApi.builder().pathsToMatch("/"+name+"/**").group(name).build());
		});
		return groups;
	}
}
