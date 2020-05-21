package com.trafficaccidentsanalysis.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Repository
public interface AccidentRepository extends JpaRepository<Accident, Integer> {

	List<Vehicle> findByVehiclesModel(String modelDto);

	List<Vehicle> findByVehiclesYear(int yearDto);

	List<Vehicle> findByVehiclesMake(String makeDto);
	
	// List<Vehicle> findByVehiclesYearAndMake (int yearDto, String makeDto);

}
