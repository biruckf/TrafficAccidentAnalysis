package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.repository.MotoristRepository;


	@Service
	public class MotoristServiceImpl implements MotoristService{
		@Autowired
		MotoristRepository motoristRepository;

		@Override
		public List<Motorist> getAllMotorists() {
			
			return motoristRepository.findAll();
		}
		@Override
		public Motorist saveMotorist(Motorist motorist) {
			
			return motoristRepository.save(motorist) ;
		}

		@Override
		public ResponseEntity<?> deleteMotorist(Motorist motorist) {
			return (ResponseEntity<?>) motoristRepository.findById(motorist.getMotoristid()).map(motoristToDelete->{
				motoristRepository.delete(motoristToDelete);
				return ResponseEntity.ok();
			}).orElseThrow(null);
			
		}

		@Override
	public Motorist updateMotoris(Motorist motorist) {
			
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
		
		