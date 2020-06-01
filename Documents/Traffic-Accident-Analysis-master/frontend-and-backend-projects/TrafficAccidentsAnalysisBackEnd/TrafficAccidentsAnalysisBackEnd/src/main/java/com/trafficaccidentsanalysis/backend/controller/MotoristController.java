package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;
import java.util.Optional;

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
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.MotoristService;



@RestController
@RequestMapping("/trafficaccidentanalysis/motorist")
@CrossOrigin(origins = "http://localhost:4200")
public class MotoristController {

	@Autowired
	private MotoristService motoristService;
	
	@PostMapping("/save")
	public Motorist SaveMotorist(@RequestBody Motorist motorist) {
		return motoristService.saveMotorist(motorist);
	}
	@PostMapping("/save/{id}")
	public Optional<Vehicle> SaveMotoristvehicle(@PathVariable int id,@RequestBody AccidentDto2 accdto) {
		return motoristService.saveMotoristinvehicle(id, accdto);
	}
	
	@GetMapping("/getall")
	public List<Motorist> getAllMotorist(){
		return motoristService.getAllMotorists ();
	}
	
	@PutMapping("/update")
	public Motorist updateMotorist(@RequestBody Motorist motorist) {
		return motoristService.updateMotorist(motorist);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteMotorist(@PathVariable int id){
		return motoristService.deleteMotorist(id);
	}
	
	
	
	
}
