package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.PersoninvehicleDto;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;

@Service
public interface PersoninvehicleService {

	List<Personinvehicle> getAllPersoninvehicle();

	Personinvehicle savePersoninvehicle(PersoninvehicleDto personInVehicleDto,int vehicleId);

	ResponseEntity<?> deletePersoninvehicle(Personinvehicle personinvehicle);

	Personinvehicle updatePersoninvehicle(Personinvehicle personinvehicle);

	
	
}
