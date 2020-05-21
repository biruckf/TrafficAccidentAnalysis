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

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.AccidentService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController

@RequestMapping("/trafficaccidentanalysis/accident")
public class AccidentController {
	@Autowired
	private AccidentService accidentService;
	private AccidentController vehicleService;

	@PostMapping("/save")
	public Accident saveAccident(@RequestBody AccidentDto accidentDto) {
		return accidentService.saveAccident(accidentDto);

	}

	@GetMapping("/getall")
	public List<Accident> getAllAccident() {
		return accidentService.getAllAccident();

	}

	@PutMapping("/update")
	public Accident updateAccident(@RequestBody Accident accident) {
		return accidentService.updateAccident(accident);

	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteAccident(@RequestBody Accident accident) {
		return accidentService.deleteAccident(accident);

	}

	@GetMapping("/getvehicle/model/{model}/accident/")
	public List<Vehicle> getVehicleByModel(@PathVariable(value = "model") String modelDto) {
		return accidentService.getVehicleByModel(modelDto);
	}

	@GetMapping("/getvehicle/year/{year}/make/{make}/accident/")
	public List<Vehicle> getByYearAndMake(@PathVariable(value = "year") int yearDto,
			@PathVariable(value = "make") String makeDto) {
		List<Vehicle> vehicles = vehicleService.getByYearAndMake(yearDto, makeDto);
		return vehicles;
		// return accidentService.getVehicleByYearMake(yearDto, makeDto);
	}
}
