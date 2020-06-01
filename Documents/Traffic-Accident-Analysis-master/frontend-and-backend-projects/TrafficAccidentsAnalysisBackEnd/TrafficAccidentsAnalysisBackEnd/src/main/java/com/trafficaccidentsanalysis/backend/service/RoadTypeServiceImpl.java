package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Roadtype;
import com.trafficaccidentsanalysis.backend.repository.RoadTypeRepository;

@Service
public class RoadTypeServiceImpl implements RoadTypeService{
	@Autowired
	RoadTypeRepository roadtypeRepository;

	public List<Roadtype> getAllRoadType() {
		
		return roadtypeRepository.findAll();
	}
	public Roadtype saveRoadType(Roadtype roadtype) {
		
		return roadtypeRepository.save(roadtype) ;
	}
	public ResponseEntity<?> deleteRoadType(Roadtype roadtype) {
		return (ResponseEntity<?>) roadtypeRepository.findById(roadtype.getRoadTypeid()).map(roadtypeToDelete->{
			roadtypeRepository.delete(roadtypeToDelete);
			return ResponseEntity.ok();
		}).orElseThrow(null);
		
	
	}
	


public Roadtype updateRoadType(Roadtype roadtype) {
	
	return roadtypeRepository.findById(roadtype.getRoadTypeid()).map(oldRoadType->{
		
		oldRoadType.setDateUpdated(new Date());
		oldRoadType.setRoadType(roadtype.getRoadType());
		oldRoadType.setRoadTypeid(roadtype.getRoadTypeid());
		oldRoadType.setUpdatedBy(roadtype.getUpdatedBy());
		
		
		return roadtypeRepository.save(oldRoadType);
	}).orElseThrow(null);
}

}