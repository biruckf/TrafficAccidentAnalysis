package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.dto.RoadTypeDto;
import com.trafficaccidentsanalysis.backend.dto.WeatherDuringAccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
@Service
public interface AccidentService {

	List<Accident> getAllAccident();
	Accident saveAccident(AccidentDto accidentDto);
	Accident saveAccident(Accident accident);
	ResponseEntity<?> deleteAccident(Accident accident);
	Accident updateAccident(Accident accident);
	List<Vehicle> getAccidentVehicle(int id);
	List<Accident> getAccidentsByRoadType(RoadTypeDto roadTypeDto);
	List<Accident> getAccidentsByWeatherDuringAccident(WeatherDuringAccidentDto weatherDuringAccidentDto);
	
}
