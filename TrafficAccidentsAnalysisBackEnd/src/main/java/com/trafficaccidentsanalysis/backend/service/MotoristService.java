package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Motorist;

@Service
public interface MotoristService {
	List<Motorist> getAllMotorists();
	Motorist saveMotorist(Motorist motorist);
	ResponseEntity<?> deleteMotorist(Motorist motorist);
	Motorist updateMotorist(Motorist motorist);
}
 