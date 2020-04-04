package com.trafficaccidentsanalysis.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trafficaccidentsanalysis.backend.model.Oldpassword;
import com.trafficaccidentsanalysis.backend.service.OldpasswordService;

@RestController
@RequestMapping("/trafficaccidentanalysis/oldpassword")
public class OldpasswordController {

	@Autowired
	private OldpasswordService oldpasswordService;
	
	@PostMapping("/save")
	public Oldpassword SaveOldpassword(@RequestBody Oldpassword oldpassword) {
		return oldpasswordService.saveOldpassword(oldpassword);
	}
	
	@GetMapping("/getall")
	public List<Oldpassword> getAllOldpassword(){
		return oldpasswordService.getAllOldpassword();
	}
	
	@PutMapping("/update")
	public Oldpassword updateOldpassword(@RequestBody Oldpassword oldpassword) {
		return oldpasswordService.updateOldpassword(oldpassword);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteOldpassword(@RequestBody Oldpassword oldpassword){
		return oldpasswordService.deleteOldpassword(oldpassword);
	}
	
	
	
	
}

