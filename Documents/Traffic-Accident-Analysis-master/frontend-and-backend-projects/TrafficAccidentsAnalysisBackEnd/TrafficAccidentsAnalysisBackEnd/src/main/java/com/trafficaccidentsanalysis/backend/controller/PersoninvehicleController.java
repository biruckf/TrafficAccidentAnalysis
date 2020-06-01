package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;
import java.util.Optional;
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

import com.trafficaccidentsanalysis.backend.dto.AccidentDto2;
import com.trafficaccidentsanalysis.backend.dto.PersoninvehicleDto;
import com.trafficaccidentsanalysis.backend.dto.VehicleDto;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.PersoninvehicleService;

@RestController
@RequestMapping("/trafficaccidentanalysis/personinvehicle")
@CrossOrigin(origins = "http://localhost:4200")
public class PersoninvehicleController {
	
	@Autowired
	private PersoninvehicleService personinvehicleService;
	
	@GetMapping("getall")
	public List<Personinvehicle> getAllPersoinvehicle(){
		return personinvehicleService.getAllPersoninvehicle();
			
	}
	
	@PostMapping("/save/{id}")
	public Optional<Vehicle> SavePersoninvehicle(@PathVariable int id,@RequestBody AccidentDto2 accdto) {
		return personinvehicleService.savePersoninvehicle(id, accdto);
	}



	@PostMapping("/save")
	public Personinvehicle SavePersoninvehicle(@RequestBody Personinvehicle personinvehicle) {
		return personinvehicleService.savePersoninvehicle(personinvehicle);	
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
