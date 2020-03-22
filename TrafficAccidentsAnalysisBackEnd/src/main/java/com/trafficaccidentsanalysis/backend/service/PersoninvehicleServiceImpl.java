package com.trafficaccidentsanalysis.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.repository.PersoninvehicleRepository;

@Service
public class PersoninvehicleServiceImpl implements PersoninvehicleService {
	
	@Autowired
	PersoninvehicleRepository personinvehicleRepository;
}
