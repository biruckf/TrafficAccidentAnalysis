package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.dto.RoadTypeDto;
import com.trafficaccidentsanalysis.backend.dto.WeatherDuringAccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.AccidentService;

@RestController
@RequestMapping("/trafficaccidentanalysis/accident")
@CrossOrigin(origins = "http://localhost:4200")
public class AccidentController {
	@Autowired
	private AccidentService accidentService;
	
	@PostMapping("/save")
	public Accident saveAccident(@RequestBody AccidentDto accidentDto) {
	
		return accidentService.saveAccident(accidentDto);
		
	}
	@GetMapping("/vehicles/{id}")
	public List<Vehicle> getAccidentVehicles(@PathVariable int id){
		return accidentService.getAccidentVehicle(id);
	}
	
	@GetMapping("/getall")
	public List<Accident> getAllAccident(){
		return accidentService.getAllAccident();
		
	}
	

	@GetMapping("/getallaccidents/roadtype")
	public List<Accident> getAccidentsByRoadType (@RequestBody RoadTypeDto roadTypeDto){
	List<Accident> accidents = accidentService.getAccidentsByRoadType(roadTypeDto);
	    return accidents;
	
	}
	
	@GetMapping("/getallaccidents/weatherduringaccident")
	public List<Accident> getAccidentsByWeatherDuringAccident (@RequestBody WeatherDuringAccidentDto weatherDuringAccidentDto){
	List<Accident> accidents = accidentService.getAccidentsByWeatherDuringAccident(weatherDuringAccidentDto);
	    return accidents;
	
	}
	@PutMapping("/update")
	public Accident updateAccident(@RequestBody Accident accident) {
		return accidentService.updateAccident(accident);
		
	}
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteAccident(@RequestBody Accident accident){
	   return  accidentService.deleteAccident(accident);
		
		
	}

}
