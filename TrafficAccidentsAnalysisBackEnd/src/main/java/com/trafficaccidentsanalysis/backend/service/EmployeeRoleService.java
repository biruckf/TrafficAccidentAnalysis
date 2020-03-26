package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Employeerole;

@Service
public interface EmployeeRoleService {
	
	List<Employeerole> getAllEmployeeRole();
	Employeerole saveEmployeeRole(Employeerole employeeRole);
	ResponseEntity<?> deleteEmployeeRole(Employeerole employeeRole);
	Employeerole updateEmployeeRole(Employeerole employeeRole);

}
