package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired 
	IEmployeeRepositoryService iEmployeeRepositoryService;

	@Override
	public Integer saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee saveEmployee = iEmployeeRepositoryService.save(employee);	
		return saveEmployee.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return iEmployeeRepositoryService.findAll();
	}
	
	
}
