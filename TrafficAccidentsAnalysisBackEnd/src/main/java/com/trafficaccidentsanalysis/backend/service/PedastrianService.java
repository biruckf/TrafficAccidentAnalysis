package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Pedastrian;

@Service
public interface PedastrianService {

	List<Pedastrian> getAllPedastrian();

	Pedastrian savePedastrian(Pedastrian pedastrian);

	void deletePedastrian(Pedastrian pedastrian);

	void updatePedastrian(Pedastrian pedastrian);

}
