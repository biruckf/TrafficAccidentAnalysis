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

import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.service.MotoristService;



@RestController
@RequestMapping("/trafficaccidentanalysis/motorist")
public class MotoristController {

	@Autowired
	private MotoristService motoristService;
	
	@PostMapping("/save")
	public Motorist SaveMotorist(@RequestBody Motorist motorist) {
		return motoristService.saveMotorist(motorist);
	}
	
	@GetMapping("/getall")
	public List<Motorist> getAllMotorist(){
		return motoristService.getAllMotorists ();
	}
	
	@PutMapping("/update")
	public Motorist updateMotorist(@RequestBody Motorist motorist) {
		return motoristService.updateMotoris(motorist);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteMotorist(@RequestBody Motorist motorist){
		return motoristService.deleteMotorist(motorist);
	}
	
	
	
	
}
