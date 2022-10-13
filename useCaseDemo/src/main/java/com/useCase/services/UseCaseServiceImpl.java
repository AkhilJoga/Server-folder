package com.useCase.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.useCase.entity.Student;

@Service
public class UseCaseServiceImpl implements IUseCaseService,GetbyFaculty {

	@Autowired
	IUseCaseServiceRepository iUseCaseServiceRepository;
	
	
	@Transactional 
	@Override
	public Integer createStudent(Student student) {
		// TODO Auto-generated method stub
		Student existedStudent =iUseCaseServiceRepository.save(student);
		return existedStudent.getId();
		
	}

	@Override
	public Optional<Student> getById(Integer id) {
		// TODO Auto-generated method stub
		//return iUseCaseServiceRepository.findById(id);
		List<Student> existedList = iUseCaseServiceRepository.findAll();
		return existedList.stream().filter(students->students.getId().equals(id)).findAny();
	}
	
	//GetbyFaculty getbyFaculty=(String faculty)->existedList.stream().filter(students->students.getFaculty().equals(faculty)).findAny().orElseThrow(null);
	
	@Override
	public List<Student> getByfaculty(String faculty) {
		// TODO Auto-generated method stub
		List<Student> existedList = iUseCaseServiceRepository.findAll();
		//existedList.stream().map(student ->student.getSname().toUpperCase());
		
		return existedList.stream().filter(student->student.getFaculty().equals(faculty)).collect(Collectors.toList());
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return iUseCaseServiceRepository.findAll();
	}

}


