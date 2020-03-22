package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Motorist;

@Service
public interface MotoristService {
	List<Motorist> getAllMotorists();
	Motorist saveMotorist(Motorist motorist);
	void deleteMotorist(Motorist motorist);
	Motorist updateMotoris(Motorist motorist);
}
 