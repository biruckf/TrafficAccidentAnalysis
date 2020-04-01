package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trafficaccidentsanalysis.backend.model.Employee;
import com.trafficaccidentsanalysis.backend.service.EmployeeService;

@RestController
@RequestMapping("/trafficaccidentsanalysis/employee")
public class EmployeeController {
	@Autowired
	
	private EmployeeService employeeService;
	
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee()	{
		return employeeService.getAllEmplyee();
		
	}
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteEmployee(@RequestBody Employee employee) {
		return employeeService.deleteEmployee(employee);
		
	}
}
