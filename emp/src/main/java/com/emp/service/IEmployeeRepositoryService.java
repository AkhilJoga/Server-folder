package com.emp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.model.Employee;

public interface IEmployeeRepositoryService  extends JpaRepository<Employee,Integer> {

	
	
}
