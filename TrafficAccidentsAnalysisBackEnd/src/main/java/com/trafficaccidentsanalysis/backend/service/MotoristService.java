package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.MotoristDto;
import com.trafficaccidentsanalysis.backend.model.Motorist;

@Service
public interface MotoristService {
	List<Motorist> getAllMotorists();
	Motorist saveMotorist(MotoristDto motoristDto, int vehicleId);
	ResponseEntity<?> deleteMotorist(int id);
	Motorist updateMotorist(Motorist motorist);
}
 