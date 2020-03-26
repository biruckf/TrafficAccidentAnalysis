package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trafficaccidentsanalysis.backend.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {


}
