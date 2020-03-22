package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;

@Repository
public interface PersoninvehicleRepository extends JpaRepository<Personinvehicle, Integer> {
  	
	
}

