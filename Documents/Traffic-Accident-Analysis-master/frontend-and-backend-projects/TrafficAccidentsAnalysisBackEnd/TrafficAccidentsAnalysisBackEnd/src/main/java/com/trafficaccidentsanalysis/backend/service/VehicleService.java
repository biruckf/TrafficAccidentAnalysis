package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Service
public interface VehicleService {
	 Iterable<Vehicle> findAll();
	Vehicle saveVehicle(Vehicle vehicle);
//	Vehicle addVehicle(Vehicle vehicle);
	ResponseEntity<?> deleteVehicle(Vehicle vehicle);
	Vehicle updateVehicle(Vehicle vehicle);
	
	Set<Vehicle>  findByAccident(int id);
}


