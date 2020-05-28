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

import com.trafficaccidentsanalysis.backend.dto.MakeDto;
import com.trafficaccidentsanalysis.backend.dto.ModelDto;
import com.trafficaccidentsanalysis.backend.dto.VehicleDto;
import com.trafficaccidentsanalysis.backend.dto.YearDto;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.service.AccidentService;
import com.trafficaccidentsanalysis.backend.service.VehicleService;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/trafficaccidentsanalysis/vehicle")
public class VehicleController {
	@Autowired

	private VehicleService vehicleService;

	@Autowired
	private AccidentService accidentService;

	@GetMapping("/getAll")
	public List<Vehicle> getAllVehicle() {
		return vehicleService.getAllVehicle();
	}

	@GetMapping("/getby/accident/{id}")
	public Set<Vehicle> getAllVehicleByAccidentId(@PathVariable(value = "id") int accidentId) {
		return accidentService.getVehicleByAccidentId(accidentId);
	}

	@PostMapping("/save")
	public Vehicle saveVehicle(@RequestBody VehicleDto vehicle) {
		return vehicleService.saveVehicle(vehicle);

	}

	@PutMapping("/update")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.updateVehicle(vehicle);

	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.deleteVehicle(vehicle);

	}

	@GetMapping("/getvehicle/model")
	public List<Vehicle> getByModel(@RequestBody ModelDto modelDto) {
		List<Vehicle> vehicles = vehicleService.findByModel(modelDto);
		return vehicles;
	}

	@GetMapping("/getvehicle/year")
	public List<Vehicle> getByYear(@RequestBody YearDto yearDto) {
		List<Vehicle> vehicles = vehicleService.findByYear(yearDto);
		return vehicles;

	}

	@GetMapping("/getvehicle/make")
	public List<Vehicle> getByMake(@RequestBody MakeDto makeDto) {
		List<Vehicle> vehicles = vehicleService.findByMake(makeDto);
		return vehicles;

	}
}