package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Vehicle;
@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
