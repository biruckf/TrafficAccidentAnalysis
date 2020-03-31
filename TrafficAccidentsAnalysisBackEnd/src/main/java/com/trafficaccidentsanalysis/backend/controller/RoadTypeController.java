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

import com.trafficaccidentsanalysis.backend.model.Roadtype;
import com.trafficaccidentsanalysis.backend.service.RoadTypeService;

@RestController
@RequestMapping("/trafficaccidentanalysis/roadtype")
public class RoadTypeController {

	@Autowired
	private RoadTypeService roadTypeService;
	
	@PostMapping("/save")
	public Roadtype SaveRoadType(@RequestBody Roadtype roadType) {
		return roadTypeService.saveRoadType(roadType);
	}
	
	@GetMapping("/getall")
	public List<Roadtype> getAllRoadTypes(){
		return roadTypeService.getAllRoadType();
	}
	
	@PutMapping("/update")
	public Roadtype updateRoadType(@RequestBody Roadtype roadType) {
		return roadTypeService.updateRoadType(roadType);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteRoadType(@RequestBody Roadtype roadType){
		return roadTypeService.deleteRoadType(roadType);
	}
	
	
	
	
}
