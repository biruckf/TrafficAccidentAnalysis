package com.trafficaccidentsanalysis.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.repository.PedastrianRepository;

@Service
public class PedastrianServiceImpl implements PedastrianService {
	
	@Autowired
	PedastrianRepository pedastianRepository;

}
