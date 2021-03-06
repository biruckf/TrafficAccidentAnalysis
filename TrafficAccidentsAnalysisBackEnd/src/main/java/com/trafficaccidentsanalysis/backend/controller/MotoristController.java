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

import com.trafficaccidentsanalysis.backend.dto.MotoristDto;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.service.MotoristService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/trafficaccidentanalysis/motorist")
public class MotoristController {

	@Autowired
	private MotoristService motoristService;
	
	@PostMapping("/save/{vehicleId}")
	public Motorist SaveMotorist(@RequestBody MotoristDto motoristDto, @PathVariable (value="vehicleId") int vehicleId) {
		return motoristService.saveMotorist(motoristDto,vehicleId);
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
