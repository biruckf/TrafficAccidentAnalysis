package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto2;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Service
public interface MotoristService {
	List<Motorist> getAllMotorists();
	Motorist saveMotorist(Motorist motorist);
	ResponseEntity<?> deleteMotorist(int id);
	Motorist updateMotorist(Motorist motorist);
	Optional<Vehicle>  saveMotoristinvehicle(int id,AccidentDto2 accdto);
}
 