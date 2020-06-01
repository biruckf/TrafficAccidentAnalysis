package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto2;
import com.trafficaccidentsanalysis.backend.dto.PersoninvehicleDto;
import com.trafficaccidentsanalysis.backend.dto.VehicleDto;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Service
public interface PersoninvehicleService {

	List<Personinvehicle> getAllPersoninvehicle();

	Personinvehicle savePersoninvehicle(Personinvehicle personinvehicle);

	ResponseEntity<?> deletePersoninvehicle(Personinvehicle personinvehicle);

	Personinvehicle updatePersoninvehicle(Personinvehicle personinvehicle);
	Optional<Vehicle>  savePersoninvehicle(int id,AccidentDto2 accdto);

	
	
}
