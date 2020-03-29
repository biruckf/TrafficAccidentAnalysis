package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Roadtype;

@Service
public interface RoadTypeService {
    List<Roadtype> getAllRoadType();
	Roadtype saveRoadType(Roadtype roadtype);
	Roadtype updateRoadType(Roadtype roadtype);
	ResponseEntity<?> deleteRoadType(Roadtype roadtype);
	
}
