package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dotconverter.AccidentDtoConverter;
import com.trafficaccidentsanalysis.backend.dotconverter.VehicleDtoConverter;
import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.AccidentRepository;
import com.trafficaccidentsanalysis.backend.repository.MotoristRepository;
import com.trafficaccidentsanalysis.backend.repository.PedastrianRepository;
import com.trafficaccidentsanalysis.backend.repository.PersoninvehicleRepository;
import com.trafficaccidentsanalysis.backend.repository.VehicleRepository;

@Service
public class AccidentServiceImpl implements AccidentService {
	@Autowired
	AccidentRepository accidentRepository;
	
	@Override
	public List<Accident> getAllAccident() {
		
		return accidentRepository.findAll();
	}

	@Override
	public Accident saveAccident(AccidentDto accidentDto) {
		return accidentRepository.save(new AccidentDtoConverter().
				AccidentDtoToAccidentConverter(accidentDto));
		
		}

	@Override
	public ResponseEntity<?> deleteAccident(Accident accident) {
		
		return (ResponseEntity<?>)accidentRepository.findById(accident.getAccidentid()).map(accidentToDelete->{
			accidentRepository.delete(accidentToDelete);
			return ResponseEntity.ok();
		}).orElseThrow(null);
		
		}
	

	@Override
	public Accident updateAccident(Accident accident) {
		
		return accidentRepository.findById(accident.getAccidentid()).map(oldAccident->{
			oldAccident.setAdditionalInfo(accident.getAdditionalInfo());
			oldAccident.setAccidentType(accident.getAccidentType());
			oldAccident.setAddressLocation(accident.getAddressLocation());
			oldAccident.setAttachments(accident.getAttachments());
			oldAccident.setCity(accident.getCity());
			oldAccident.setDateCreated(accident.getDateCreated());
			oldAccident.setDateOfAccident(accident.getDateOfAccident());
			oldAccident.setDateUpdated(accident.getDateUpdated());
			oldAccident.setLatitude(accident.getLatitude());
			oldAccident.setLegalRoadSpeedKmh(accident.getLegalRoadSpeedKmh());
			oldAccident.setLogitude(accident.getLogitude());
			oldAccident.setNumberOfDeath(accident.getNumberOfDeath());
			oldAccident.setNumberOfMajorInjury(accident.getNumberOfMajorInjury());
			oldAccident.setNumberOfMinorInjury(accident.getNumberOfMinorInjury());
			oldAccident.setNumberOfModerateInjury(accident.getNumberOfModerateInjury());
			oldAccident.setNumberOfPeopleInvolved(accident.getNumberOfPeopleInvolved());
			oldAccident.setNumberOfVehiclesInvolved(accident.getNumberOfVehiclesInvolved());
			oldAccident.setRegion(accident.getRegion());
			oldAccident.setReportingOfficerName(accident.getReportingOfficerName());
			oldAccident.setReportingOfficerPhone(accident.getReportingOfficerPhone());
			oldAccident.setReportingOfficerStataion(accident.getReportingOfficerStataion());
			oldAccident.setRoadClassification(accident.getRoadClassification());
			oldAccident.setRoadCondition(accident.getRoadCondition());
			oldAccident.setRoadType(accident.getRoadType());
			oldAccident.setTimeOfAccident(accident.getTimeOfAccident());
			oldAccident.setUknownInjury(accident.getUknownInjury());
			oldAccident.setUpdatedBy(accident.getUpdatedBy());
			oldAccident.setVehicles(accident.getVehicles());
			oldAccident.setWeatherDuringAccident(accident.getWeatherDuringAccident());
			return accidentRepository.save(oldAccident);
		}).orElseThrow(null);
				
			

			
		
	}

	@Override
	public Accident saveAccident(Accident accident) {
		return accidentRepository.save(accident);
	}

}
