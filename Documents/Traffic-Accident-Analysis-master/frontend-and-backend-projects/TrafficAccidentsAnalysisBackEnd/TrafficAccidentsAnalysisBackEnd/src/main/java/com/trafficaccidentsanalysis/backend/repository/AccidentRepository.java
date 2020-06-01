package com.trafficaccidentsanalysis.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Accident;

@Repository
public interface AccidentRepository  extends JpaRepository<Accident, Integer>  {

	 List<Accident> getAccidentsByRoadType(String roadTypeDto);
	 List<Accident> getAccidentsByWeatherDuringAccident(String weatherDuringAccidentDto);
}
