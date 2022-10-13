package com.useCase.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.useCase.entity.Student;

@Repository
public interface IUseCaseServiceRepository extends JpaRepository<Student, Integer> {

	
}
