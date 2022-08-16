package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.IEmployeeService;

@RestController
public class EmpController {

	@Autowired
	IEmployeeService iemployeeService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "IIHT Demo Starter Welcome'''";
	}
	
	@PostMapping("/saveEmployee")
	public Integer createEmployee(@RequestBody Employee employee) {
		Integer createdId = iemployeeService.saveEmployee(employee);
		
		return createdId;
		
	}
	
	@GetMapping("/allEmployees")
	public List<Employee> getEmployees(){
		
		return iemployeeService.getAllEmployees();
	}
}