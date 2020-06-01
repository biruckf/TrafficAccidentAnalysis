package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Employeecontact;

@Service
public interface EmployeeContactService {
	
		List <Employeecontact> getAllEmplyeecontact();
		Employeecontact saveEmployeecontact(Employeecontact employeecontact);
		ResponseEntity<?>deleteEmployeecontact(Employeecontact employeecontact);
		Employeecontact updateEmployeecontact(Employeecontact employeecontact);

}