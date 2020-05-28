package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.MakeDto;
import com.trafficaccidentsanalysis.backend.dto.ModelDto;
import com.trafficaccidentsanalysis.backend.dto.VehicleDto;
import com.trafficaccidentsanalysis.backend.dto.YearDto;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Service
public interface VehicleService {
	public List<Vehicle> getAllVehicle();

	Vehicle saveVehicle(VehicleDto vehicle);

//	Vehicle addVehicle(Vehicle vehicle);
	ResponseEntity<?> deleteVehicle(Vehicle vehicle);

	Vehicle updateVehicle(Vehicle vehicle);

	Vehicle findVehicleById(int vehicleId);

	List<Vehicle> findByModel(ModelDto modelDto);

	List<Vehicle> findByYear(YearDto yearDto);

	List<Vehicle> findByMake(MakeDto makeDto);
	// List<Vehicle> getVehicleByYearMake (int yearDto, String makeDto);

}
