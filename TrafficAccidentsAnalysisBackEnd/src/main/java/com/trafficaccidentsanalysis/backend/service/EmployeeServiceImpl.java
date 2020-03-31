package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Employee;
import com.trafficaccidentsanalysis.backend.model.Employeecontact;
import com.trafficaccidentsanalysis.backend.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmplyee() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public Employee saveEmployeecontact(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public ResponseEntity<?> deleteEmployee(Employee employee) {
		return (ResponseEntity<?>)employeeRepository.findById(employee.getEmployeeid()).map(oldemployeecontactToDelete->{
			employeeRepository.delete(employee);
			return ResponseEntity.ok();
					}).orElseThrow(null);
			
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.findById(employee.getEmployeeid()).map(oldemployee->
		{
				oldemployee.setAccessLockoutEnd(employee.getAccessLockoutEnd());
				oldemployee.setAdditionalInfo(employee.getAdditionalInfo());
				oldemployee.setDateCreated(employee.getDateCreated());
				oldemployee.setDateUpdated(employee.getDateUpdated());
				oldemployee.setFirstName(employee.getFirstName());
				oldemployee.setIsActive(employee.getIsActive());
				oldemployee.setLastAccessedDate(employee.getLastAccessedDate());
				oldemployee.setLastName(employee.getLastName());
				oldemployee.setLoginFailedCount(employee.getLoginFailedCount());
				oldemployee.setLoginLockoutEnabled(employee.getLoginLockoutEnabled());
				oldemployee.setPasswordHash(employee.getPasswordHash());
				oldemployee.setPasswordSalt(employee.getPasswordSalt());
				oldemployee.setUpdatedBy(employee.getUpdatedBy());
				oldemployee.setUserName(employee.getUserName());
				oldemployee.setEmployeecontacts(employee.getEmployeecontacts());
				oldemployee.setEmployeeroles(employee.getEmployeeroles());
				oldemployee.setOldpasswords(employee.getOldpasswords());
		
		return employeeRepository.save(oldemployee);
				}).orElseThrow(null);
		
	}



}
