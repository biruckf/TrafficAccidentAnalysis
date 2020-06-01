package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.VehicleService;

@RestController
@RequestMapping("/trafficaccidentsanalysis/vehicle")

@CrossOrigin(origins = "*", maxAge = 3600)
public class VehicleController {
	@Autowired
	
	private VehicleService vehicleService;
	
	@GetMapping("/getAll")
	public Iterable<Vehicle> getAllVehicle() {
		return this.vehicleService.findAll();
	}
	
	@PostMapping("/save")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {
		return this.vehicleService.saveVehicle(vehicle);
		
	}
	
	@GetMapping("/vehicles/accident/{id}")
	public Set<Vehicle> getAccidentVehicles(@PathVariable int id) {
		return this.vehicleService.findByAccident(id);
	}


	
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.deleteVehicle(vehicle);
		
	}
	
}