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

import com.trafficaccidentsanalysis.backend.model.Employeerole;
import com.trafficaccidentsanalysis.backend.service.EmployeeRoleService;

@RestController
@RequestMapping("/trafficaccidentanalysis/employeerole")
public class EmployeeRoleController {

	@Autowired
	private EmployeeRoleService employeeRoleService;
	
	@GetMapping("/getall")
	public List<Employeerole> getAllEmployeeRole(){
		return employeeRoleService.getAllEmployeeRole();
	}
	
	@PostMapping("/save")
	public Employeerole SaveEmployeeRole(@RequestBody Employeerole employeeRole) {
		return employeeRoleService.saveEmployeeRole(employeeRole);
	}
	
	@PutMapping("/update")
	public Employeerole updateEmployeeRole(@RequestBody Employeerole employeeRole) {
		return employeeRoleService.updateEmployeeRole(employeeRole);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteEmployeeRole(@RequestBody Employeerole employeeRole){
		return employeeRoleService.deleteEmployeeRole(employeeRole);
	}
	
	
}

