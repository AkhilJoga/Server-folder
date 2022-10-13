package com.useCase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.useCase.entity.Student;
import com.useCase.services.UseCaseServiceImpl;

@SpringBootTest
class UseCaseDemoApplicationTests {

	@Autowired
	UseCaseServiceImpl useCaseServiceImpl;
	
	@Test
	void contextLoads() {
		useCaseServiceImpl.createStudent(new Student(122,"Akhil",34,67,89,34+89+67,"George"));
		
	}

}
