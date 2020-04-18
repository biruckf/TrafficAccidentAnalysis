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

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.service.AccidentService;

@RestController
@RequestMapping("/trafficaccidentanalysis/accident")
public class AccidentController {
	@Autowired
	private AccidentService accidentService;
	
	@PostMapping("/save")
	public Accident saveAccident(@RequestBody AccidentDto accidentDto) {
		return accidentService.saveAccident(accidentDto);
		
	}
	
	@GetMapping("/getall")
	public List<Accident> getAllAccident(){
		return accidentService.getAllAccident();
		
	}
	@PutMapping("/update")
	public Accident updateAccident(@RequestBody Accident accident) {
		return accidentService.updateAccident(accident);
		
	}
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteAccident(@RequestBody Accident accident){
		return accidentService.deleteAccident(accident);
		
	}

}
