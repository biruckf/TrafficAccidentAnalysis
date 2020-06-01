package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Employee;
import com.trafficaccidentsanalysis.backend.model.Employeecontact;

@Service
public interface EmployeeService {

	List<Employee> getAllEmplyee();
	Employee addEmployee (Employee employee);
	ResponseEntity<?> deleteEmployee(Employee employee);
	Employee updateEmployee(Employee employee);

}
