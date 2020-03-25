package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Accident;
@Service
public interface AccidentService {

	List<Accident> getAllAccident();
	Accident saveAccident(Accident accident);
	ResponseEntity<?> deleteAccident(Accident accident);
	Accident updateAccident(Accident accident);
}
