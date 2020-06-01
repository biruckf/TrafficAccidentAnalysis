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
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.PedastrianService;

@RestController
@RequestMapping("/trafficaccidentanalysis/pedastrian")
@CrossOrigin(origins = "http://localhost:4200")
public class PedastrianController {
	
	@Autowired
     private PedastrianService pedastrianService;
	
	@GetMapping("/getall")
	public List<Pedastrian> getAllPedastrian(){
		return pedastrianService.getAllPedastrian();
	}
	
	@PostMapping("/save/{id}")
	public Optional<Vehicle> SavePersoninvehicle(@PathVariable int id,@RequestBody AccidentDto2 accdto) {
		return pedastrianService.savePedesterian(id, accdto);
	}
	
	@PostMapping("/save")
	public Pedastrian SavePedastrian(@RequestBody Pedastrian pedastrian) {
		return pedastrianService.savePedastrian(pedastrian);		
	}
	
	@PutMapping("/update")
	public Pedastrian updatePedastrian(@RequestBody Pedastrian pedastrian) {
		return pedastrianService.updatePedastrian(pedastrian);		
	}
		
	@DeleteMapping("/delete")
	public ResponseEntity<?> deletePedastrian(@RequestBody Pedastrian pedastrian){
		return pedastrianService.deletePedastrian(pedastrian);
		
	}

}
