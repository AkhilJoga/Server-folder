package com.sportDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sportDemo.entity.Sports;
import com.sportDemo.service.SportServiceImpl;

@SpringBootTest
class SportsDemoApplicationTests {

	@Autowired
	SportServiceImpl sportServiceImpl;
	
	Sports sport = new Sports();
	
	@Test
	void contextLoads() {
		sport.setAge(30);
		sport.setDob("12/5/1990");
		sport.setEmail("sport@gmail.com");
		sport.setFirstName("Akhil");
		sport.setLastName("JA");
		sport.setMobile("8908908901");
		sport.setPassword("password");
		
		assertEquals(Integer.class,(sportServiceImpl.createSportUser(sport)).getClass());
	}

}
