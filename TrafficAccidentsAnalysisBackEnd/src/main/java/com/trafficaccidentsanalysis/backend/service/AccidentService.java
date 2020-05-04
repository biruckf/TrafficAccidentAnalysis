package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
@Service
public interface AccidentService {

	List<Accident> getAllAccident();
	Accident saveAccident(AccidentDto accidentDto);
	Accident saveAccident(Accident accident);
	ResponseEntity<?> deleteAccident(Accident accident);
	Accident updateAccident(Accident accident);
	Set<Vehicle> getVehicleByAccidentId(int accidentId);
}
