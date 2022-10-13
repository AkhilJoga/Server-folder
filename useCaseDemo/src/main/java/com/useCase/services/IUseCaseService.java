package com.useCase.services;

import java.util.List;
import java.util.Optional;

import com.useCase.entity.Student;

public interface IUseCaseService {

	Integer createStudent(Student student);
	
	Optional<Student> getById(Integer id);
	
	List<Student> getAll();
	
}
