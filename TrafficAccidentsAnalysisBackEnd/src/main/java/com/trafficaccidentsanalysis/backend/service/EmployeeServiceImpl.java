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
				employee.setAccessLockoutEnd(employee.getAccessLockoutEnd());
				employee.setAdditionalInfo(employee.getAdditionalInfo());
				employee.setDateCreated(employee.getDateCreated());
				employee.setDateUpdated(employee.getDateUpdated());
				employee.setFirstName(employee.getFirstName());
				employee.setIsActive(employee.getIsActive());
				employee.setLastAccessedDate(employee.getLastAccessedDate());
				employee.setLastName(employee.getLastName());
				employee.setLoginFailedCount(employee.getLoginFailedCount());
				employee.setLoginLockoutEnabled(employee.getLoginLockoutEnabled());
				employee.setPasswordHash(employee.getPasswordHash());
				employee.setPasswordSalt(employee.getPasswordSalt());
				employee.setUpdatedBy(employee.getUpdatedBy());
				employee.setUserName(employee.getUserName());
				employee.setEmployeecontacts(employee.getEmployeecontacts());
				employee.setEmployeeroles(employee.getEmployeeroles());
				employee.setOldpasswords(employee.getOldpasswords());
		
		return employeeRepository.save(oldemployee);
				}).orElseThrow(null);
		
	}



}
