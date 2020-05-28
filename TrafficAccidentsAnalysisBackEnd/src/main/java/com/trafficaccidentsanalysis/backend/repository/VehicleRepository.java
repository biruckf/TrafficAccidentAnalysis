package com.trafficaccidentsanalysis.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.dto.MakeDto;
import com.trafficaccidentsanalysis.backend.dto.ModelDto;
import com.trafficaccidentsanalysis.backend.dto.YearDto;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

	List<Vehicle> findByModel(String model);

	List<Vehicle> findByYear(int yearDto);

	List<Vehicle> findByMake(String makeDto);

	// List<Vehicle> findByVehiclesYearAndMake (int yearDto, String makeDto);

}
