package com.trafficaccidentsanalysis.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

	Personinvehicle save(Personinvehicle personinVehicleDtoToPersoninVehicleConverter);
	List<Vehicle> findByAccidentAccidentid(int id);

}
