package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Personinvehicle;

@Service
public interface PersoninvehicleService {

	List<Personinvehicle> getAllPersoninvehicle();

	Personinvehicle savePersoninvehicle(Personinvehicle personinvehicle);

	void deletePersoninvehicle(Personinvehicle personinvehicle);

	void updatePersoninvehicle(Personinvehicle personinvehicle);

}
