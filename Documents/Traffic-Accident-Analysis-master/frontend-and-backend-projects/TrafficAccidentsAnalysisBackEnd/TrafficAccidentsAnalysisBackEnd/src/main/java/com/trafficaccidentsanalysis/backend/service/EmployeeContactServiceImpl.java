package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Employeecontact;
import com.trafficaccidentsanalysis.backend.repository.EmployeeContactRepository;

@Service
public class EmployeeContactServiceImpl implements EmployeeContactService {

	@Autowired
	
	EmployeeContactRepository employeecontactRepository;

	@Override
	public List<Employeecontact> getAllEmplyeecontact() {
		return employeecontactRepository.findAll();
		
	}

	@Override
	public Employeecontact saveEmployeecontact(Employeecontact employeecontact) {
		return employeecontactRepository.save(employeecontact);
	}

	@Override
	public ResponseEntity<?> deleteEmployeecontact(Employeecontact employeecontact) {
		return (ResponseEntity<?>)employeecontactRepository.findById(employeecontact.getEmployeeContactid()).map(oldemployeecontactToDelete->{
			employeecontactRepository.delete(employeecontact);
			return ResponseEntity.ok();
					}).orElseThrow(null);
			
	}

	@Override
	public Employeecontact updateEmployeecontact(Employeecontact employeecontact) {
		return employeecontactRepository.findById(employeecontact.getEmployeeContactid()).map(oldemployeecontact->
		{
				employeecontact.setAddressLocation(employeecontact.getAddressLocation());
				employeecontact.setCity(employeecontact.getCity());
				employeecontact.setDateCreated(employeecontact.getDateCreated());
				employeecontact.setDateUpdated(employeecontact.getDateUpdated());
				employeecontact.setDepartment(employeecontact.getDepartment());
				employeecontact.setEmail(employeecontact.getEmail());
				employeecontact.setEmailConfirmed(employeecontact.getEmailConfirmed());
				employeecontact.setEmployee(employeecontact.getEmployee());
				employeecontact.setPhoneNumber2(employeecontact.getPhoneNumber2());
				employeecontact.setPhoneNumber2type(employeecontact.getPhoneNumber2type());
				employeecontact.setPhoneNumber3(employeecontact.getPhoneNumber3());
				employeecontact.setPhoneNumber3type(employeecontact.getPhoneNumber3type());
				employeecontact.setPhoneNumberMobile(employeecontact.getPhoneNumberMobile());
				employeecontact.setPhoneNumberOffice(employeecontact.getPhoneNumberOffice());
				employeecontact.setRegion(employeecontact.getRegion());
				employeecontact.setTowFactorEnabled(employeecontact.getTowFactorEnabled());
				employeecontact.setUpdatedBy(employeecontact.getUpdatedBy());
		
		return employeecontactRepository.save(oldemployeecontact);
				}).orElseThrow(null);
		
	}


	
}