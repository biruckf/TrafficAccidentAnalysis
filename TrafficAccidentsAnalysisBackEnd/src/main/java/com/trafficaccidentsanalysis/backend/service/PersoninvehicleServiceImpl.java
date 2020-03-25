package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.repository.PersoninvehicleRepository;
@Service
public class PersoninvehicleServiceImpl implements PersoninvehicleService {

	@Autowired
	PersoninvehicleRepository personinvehicleRepository;
	@Override
	public   List<Personinvehicle>  getAllPersoninvehicle() {
	return getAllPersoninvehicle();
	}

	@Override
	 public   Personinvehicle savePersoninvehicle(Personinvehicle personinvehicle) {
	return null;
	}
	@Override
	public void deletePersoninvehicle(Personinvehicle personinvehicle) {
	}
	@Override
	 public  void updatePersoninvehicle(Personinvehicle personinvehicle) {
	}

	
}
