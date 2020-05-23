package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Service
public interface VehicleService {
	public List<Vehicle> getAllVehicle();

	Vehicle saveVehicle(Vehicle vehicle);

//	Vehicle addVehicle(Vehicle vehicle);
	ResponseEntity<?> deleteVehicle(Vehicle vehicle);

	Vehicle updateVehicle(Vehicle vehicle);

	Vehicle findVehicleById(int vehicleId);

	List<Vehicle> findByModel(String modelDto);

	List<Vehicle> findByYear(int yearDto);

	List<Vehicle> findByMake(String makeDto);
	// List<Vehicle> getVehicleByYearMake (int yearDto, String makeDto);

}
