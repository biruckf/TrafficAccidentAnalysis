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

import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.service.PersoninvehicleService;

@RestController
@RequestMapping("/trafficaccidentanalysis/personinvehicle")

public class PersoninvehicleController {
	
	@Autowired
	private PersoninvehicleService personinvehicleService;
	
	@GetMapping("getall")
	public List<Personinvehicle> getAllPersoinvehicle(){
		return personinvehicleService.getAllPersoninvehicle();
			
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
