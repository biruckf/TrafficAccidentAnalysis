package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Oldpassword;
import com.trafficaccidentsanalysis.backend.repository.MotoristRepository;
import com.trafficaccidentsanalysis.backend.repository.OldpasswordRepository;

@Service
public class OldpasswordServiceImpl implements OldpasswordService {
	
	@Autowired
	OldpasswordRepository oldpasswordRepository;

	@Override
	public List<Oldpassword> getAllOldpassword() {
		
		return oldpasswordRepository.findAll();
	}

	@Override
	public Oldpassword saveOldpassword(Oldpassword oldpassword) {
		
		return oldpasswordRepository.save(oldpassword) ;
	}

	@Override
	public ResponseEntity<?> deleteOldpassword(Oldpassword oldpassword) {
		
		return (ResponseEntity<?>) oldpasswordRepository.findById(oldpassword.getOldPasswordid()).map(oldpasswordToDelete->{
			oldpasswordRepository.delete(oldpasswordToDelete);
			return ResponseEntity.ok();
		}).orElseThrow(null);
	}

	@Override
	public Oldpassword updateOldpassword(Oldpassword oldpassword) {
		
		return oldpasswordRepository.findById(oldpassword.getOldPasswordid()).map(oldOldpassword->{
			
			oldOldpassword.setDateUpdated(new Date());
			oldOldpassword.setOldPassword(oldpassword.getOldPassword());
			oldOldpassword.setOldPasswordHash(oldpassword.getOldPasswordHash());
			oldOldpassword.setUpdatedBy(oldpassword.getUpdatedBy());
			oldOldpassword.setEmployee(oldpassword.getEmployee());
			
			
			return oldpasswordRepository.save(oldOldpassword);
		}).orElseThrow(null);
	}

}


