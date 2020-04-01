package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.VehicleService;

@RestController
@RequestMapping("/trafficaccidentsanalysis/vehicle")
public class VehicleController {
	@Autowired
	
	private VehicleService vehicleService;
	
	@GetMapping("/getAll")
	public List<Vehicle> getAllVehicle() {
		return vehicleService.getAllVehicle();
	}
	
	@PostMapping("/save")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.saveVehicle(vehicle);
		
	}

	@PutMapping("/update")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.updateVehicle(vehicle);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.deleteVehicle(vehicle);
		
	}
	
}