package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Oldpassword;

@Service
public interface OldpasswordService {

	List<Oldpassword> getAllOldpassword();

	Oldpassword saveOldpassword(Oldpassword oldpassword);

	ResponseEntity<?> deleteOldpassword(int id);

	Oldpassword updateOldpassword(Oldpassword oldpassword);

}
