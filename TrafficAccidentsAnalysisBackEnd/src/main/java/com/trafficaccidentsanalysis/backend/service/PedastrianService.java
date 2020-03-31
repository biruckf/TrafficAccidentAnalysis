package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Pedastrian;

@Service
public interface PedastrianService {

	List<Pedastrian> getAllPedastrian();
    Pedastrian savePedastrian(Pedastrian pedastrian);
    Pedastrian updatePedastrian(Pedastrian pedastrian);
	ResponseEntity<?> deletePedastrian(Pedastrian pedastrian);

}
