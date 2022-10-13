package com.useCase.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.useCase.entity.Student;
import com.useCase.services.UseCaseServiceImpl;


@RestController
public class UseCaseController {
	
	@Autowired	UseCaseServiceImpl useCaseServiceImpl;
	
	@PostMapping("createStudent")
	Integer createStudent(@RequestBody Student student) {
		return useCaseServiceImpl.createStudent(student);
	}
	
	@GetMapping("getbyId/{id}")
	Optional<Student> getById(@PathVariable Integer id){
		return useCaseServiceImpl.getById(id);
	}
	
	@GetMapping("getByFaculty/{faculty}")
	 List<Student> getByFaclty(@PathVariable String faculty){
	return useCaseServiceImpl.getByfaculty(faculty);
	}
	
	@GetMapping("getAll")
	List<Student> getAll(){
		return useCaseServiceImpl.getAll();
	}
	
}
