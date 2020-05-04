package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;

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

import com.trafficaccidentsanalysis.backend.dto.PersoninvehicleDto;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.PersoninvehicleService;
import com.trafficaccidentsanalysis.backend.service.VehicleService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/trafficaccidentanalysis/personinvehicle")

public class PersoninvehicleController {
	
	@Autowired
	private PersoninvehicleService personinvehicleService;
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("getall")
	public List<Personinvehicle> getAllPersoinvehicle(){
		return personinvehicleService.getAllPersoninvehicle();
			
	}

	@PostMapping("/save/{vehicleId}")
	public Vehicle SavePersoninvehicle(@RequestBody List<PersoninvehicleDto>  personInsVehicleDto, @PathVariable (value="vehicleId") int vehicleId) {
		
		personInsVehicleDto.forEach(person->{
			personinvehicleService.savePersoninvehicle(person,vehicleId);
		});
		
		
		return 	vehicleService.findVehicleById(vehicleId);
	}
	

	@PutMapping("/update")
	public Personinvehicle updatePersoninvehicle(@RequestBody Personinvehicle personinvehicle) {
		return personinvehicleService.updatePersoninvehicle(personinvehicle);
		
	}

	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deletePersoinvehicle(@RequestBody Personinvehicle personinvehicle ){
		return personinvehicleService.deletePersoninvehicle(personinvehicle);
		
	}
}
