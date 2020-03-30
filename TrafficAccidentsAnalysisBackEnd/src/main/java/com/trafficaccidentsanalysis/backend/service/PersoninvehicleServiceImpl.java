package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.repository.PersoninvehicleRepository;
@Service
public class PersoninvehicleServiceImpl implements PersoninvehicleService {

	@Autowired
	PersoninvehicleRepository personinvehicleRepository;
	@Override
	public   List<Personinvehicle>  getAllPersoninvehicle() {
		return personinvehicleRepository.findAll();
	}

	@Override
	 public   Personinvehicle savePersoninvehicle(Personinvehicle personinvehicle) {
		return personinvehicleRepository.save(personinvehicle);
	
	}
	
	
	@Override
	public ResponseEntity<?>  deletePersoninvehicle 
	 (Personinvehicle personinvehicle) {
		return (ResponseEntity<?>) personinvehicleRepository.findById(personinvehicle.getPersoninvehicleid()).map(personinvehicleToDelete->{
			personinvehicleRepository.delete(personinvehicleToDelete);
			return ResponseEntity.ok();	
		}).orElseThrow(null);
			
	} 
	
	
	@Override
	
	public Personinvehicle updatePersoninvehicle(Personinvehicle personinvehicle) {
	
	{
		
	return personinvehicleRepository.findById(personinvehicle.getPersoninvehicleid()).map(oldPersoninvehicle->{
			
		
		oldPersoninvehicle.setDateUpdated(new Date());
		oldPersoninvehicle.setSex(personinvehicle.getSex());
        oldPersoninvehicle.setFirstName(personinvehicle.getFirstName());
        oldPersoninvehicle.setLastName(personinvehicle.getLastName());
        oldPersoninvehicle.setMiddleName(personinvehicle.getMiddleName());
        oldPersoninvehicle.setAge(personinvehicle.getAge());
        oldPersoninvehicle.setAdditionalInfo(personinvehicle.getAdditionalInfo());
        oldPersoninvehicle.setAddress(personinvehicle.getAddress());
        oldPersoninvehicle.setPhoneNumber(personinvehicle.getPhoneNumber());
        oldPersoninvehicle.setVehicle(personinvehicle.getVehicle());
        oldPersoninvehicle.setPersonType(personinvehicle.getPersonType());
        oldPersoninvehicle.setRestraintUsed(personinvehicle.getRestraintUsed());
        oldPersoninvehicle.setInjuryClass(personinvehicle.getInjuryClass());
    	
		return personinvehicleRepository.save(oldPersoninvehicle);
	}).orElseThrow(null);
			
		}
	}
		
}

