package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dotconverter.MotoristDtoConverter;
import com.trafficaccidentsanalysis.backend.dto.MotoristDto;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.MotoristRepository;


	@Service
	public class MotoristServiceImpl implements MotoristService{
		@Autowired
		MotoristRepository motoristRepository;
		@Autowired
		VehicleService vehicleService;

		@Override
		public List<Motorist> getAllMotorists() {
			
			return motoristRepository.findAll();
		}
		@Override
		public Motorist saveMotorist(MotoristDto motoristDto, int vehicleId) {
			Vehicle vehicle=vehicleService.findVehicleById(vehicleId);
			if(vehicle!=null) {
				Motorist motorist=new MotoristDtoConverter().motoristDtoToMotoristConverter(motoristDto);
				motorist.setVehicle(vehicle);
			return motoristRepository.save(motorist) ;
			}
			return null;
		}

		@Override
		public ResponseEntity<?> deleteMotorist(int id) {
			return (ResponseEntity<?>) motoristRepository.findById(id).map(motoristToDelete->{
				motoristRepository.delete(motoristToDelete);
				return ResponseEntity.ok("scussfully deleted!");
			}).orElseThrow(null);
			
		}

		@Override
	public Motorist updateMotorist(Motorist motorist) {
			
		return motoristRepository.findById(motorist.getMotoristid()).map(oldMotorist->{
		oldMotorist.setAdditionalInfo(motorist.getAdditionalInfo());
		oldMotorist.setDateUpdated(new Date());
		oldMotorist.setHasLicense(motorist.getHasLicense());
		oldMotorist.setIssuedCountry(motorist.getIssuedCountry());
		oldMotorist.setIssuedDate(motorist.getIssuedDate());
		oldMotorist.setIssuedState(motorist.getIssuedState());
		oldMotorist.setLicenseNumber(motorist.getLicenseNumber());
		oldMotorist.setMotorisReadiness(motorist.getMotorisReadiness());
		oldMotorist.setVehicle(motorist.getVehicle());
		
		return motoristRepository.save(oldMotorist);
	}).orElseThrow(null);
			
		}
	}
		
		