package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Accident;

@Repository
public interface AccidentRepository  extends JpaRepository<Accident, Integer>  {

}
