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

import com.trafficaccidentsanalysis.backend.dto.PedastrianDto;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.PedastrianService;
import com.trafficaccidentsanalysis.backend.service.VehicleService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/trafficaccidentanalysis/pedastrian")
public class PedastrianController {
	
	@Autowired
     private PedastrianService pedastrianService;
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/getall")
	public List<Pedastrian> getAllPedastrian(){
		return pedastrianService.getAllPedastrian();
	}
	
	@PostMapping("/save/{vehicleId}")
	public Vehicle SavePedastrian(@RequestBody Set<PedastrianDto>  pedastriansdto,@PathVariable (value="vehicleId") int vehicleId) {
		pedastriansdto.forEach(pedastrian->{
			pedastrianService.savePedastrian(pedastrian,vehicleId);
		});
		return 	vehicleService.findVehicleById(vehicleId);
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
