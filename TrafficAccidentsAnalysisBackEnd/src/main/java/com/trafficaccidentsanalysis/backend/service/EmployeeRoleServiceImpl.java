package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.trafficaccidentsanalysis.backend.model.Employeerole;
import com.trafficaccidentsanalysis.backend.repository.EmployeeRoleRepository;

public class EmployeeRoleServiceImpl implements EmployeeRoleService {

	@Autowired
	EmployeeRoleRepository 	employeeRoleRepository;

	@Override
	public List<Employeerole> getAllEmployeeRole() {
		return employeeRoleRepository.findAll();
	}

	@Override
	public Employeerole saveEmployeeRole(Employeerole employeeRole) {
			return employeeRoleRepository.save(employeeRole);
	}	
	
	@Override
	public ResponseEntity<?> deleteEmployeeRole(Employeerole employeeRole) {
		return (ResponseEntity<?>) employeeRoleRepository.findById(employeeRole.getEmployeeRoleid()).map(employeeRoleDelete->{
			employeeRoleRepository.delete(employeeRoleDelete);
		return ResponseEntity.ok();
		}).orElseThrow(null);			
	}

	@Override
	public Employeerole updateEmployeeRole(Employeerole employeeRole) {
		return employeeRoleRepository.findById(employeeRole.getEmployeeRoleid()).map(newRole->{
			newRole.setDateUpdated(employeeRole.getDateUpdated());
			newRole.setEmployee(employeeRole.getEmployee());
			newRole.setRole(employeeRole.getRole());
			newRole.setUpdatedBy(employeeRole.getUpdatedBy());
			return employeeRoleRepository.save(newRole);		
			}).orElseThrow(null);

			
	}

}
