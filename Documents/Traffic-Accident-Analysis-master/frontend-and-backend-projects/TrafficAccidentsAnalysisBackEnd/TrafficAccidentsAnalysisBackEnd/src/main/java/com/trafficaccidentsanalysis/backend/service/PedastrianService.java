package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto2;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Service
public interface PedastrianService {

	List<Pedastrian> getAllPedastrian();
    Pedastrian savePedastrian(Pedastrian pedastrian);
    Pedastrian updatePedastrian(Pedastrian pedastrian);
	ResponseEntity<?> deletePedastrian(Pedastrian pedastrian);
	Optional<Vehicle>  savePedesterian(int id,AccidentDto2 accdto);

}
