package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dotconverter.AccidentDtoConverter;
import com.trafficaccidentsanalysis.backend.dotconverter.PersonInVehicleDtoConverter;
import com.trafficaccidentsanalysis.backend.dotconverter.VehicleDtoConverter;
import com.trafficaccidentsanalysis.backend.dto.AccidentDto2;
import com.trafficaccidentsanalysis.backend.dto.PersoninvehicleDto;
import com.trafficaccidentsanalysis.backend.dto.VehicleDto;
import com.trafficaccidentsanalysis.backend.dtoUtility.UtilityDto;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.PersoninvehicleRepository;
import com.trafficaccidentsanalysis.backend.repository.VehicleRepository;
@Service
public class PersoninvehicleServiceImpl implements PersoninvehicleService {

	@Autowired
	PersoninvehicleRepository personinvehicleRepository;
	
	@Autowired
	VehicleRepository vehicleRepository ;
	@Override
	public   List<Personinvehicle>  getAllPersoninvehicle() {
		return personinvehicleRepository.findAll();
	}

	@Override
	 public   Personinvehicle savePersoninvehicle(Personinvehicle personinvehicle) {
		return personinvehicleRepository.save(personinvehicle);
	
	}
	@Override
	public Optional<Vehicle> savePersoninvehicle(int id,AccidentDto2 accidentdto) {
		// TODO Auto-generated method stub
		//Set<Personinvehicle> persons = new HashSet<Personinvehicle>();
		
		System.out.println(id);
		
		Optional<Vehicle> v =   this.vehicleRepository.findById(id);
		       
		     if(v.isPresent()) {
		    	 Vehicle vehicle = v.get();
		    	   
		    	   System.out.println(vehicle.getaccident_id());
		    	  
		    	   
		    	   UtilityDto utility = new UtilityDto();
		    	   
		    	     utility.persondto(accidentdto);
		    	   
		    	  
		    		 
		    	
			      if(vehicle !=null) {
				      vehicle.setPersoninvehicles( utility.persondto(accidentdto));
				      this.vehicleRepository.save(vehicle);
			     }
		    	
		       }
		    
		    	 
		 		  
		return v;
		     
		  
	}



	
	
	@Override
	public ResponseEntity<?>  deletePersoninvehicle 
	 (Personinvehicle personinvehicle) {
		return (ResponseEntity<?>) personinvehicleRepository.findById(personinvehicle.getPersonid()).map(personinvehicleToDelete->{
			personinvehicleRepository.delete(personinvehicleToDelete);
			return ResponseEntity.ok();	
		}).orElseThrow(null);
			
	} 
	
	
	@Override
	
	public Personinvehicle updatePersoninvehicle(Personinvehicle personinvehicle) {
	
	{
		
	return personinvehicleRepository.findById(personinvehicle.getPersonid()).map(oldPersoninvehicle->{
			
		
		oldPersoninvehicle.setDateUpdated(new Date());
		oldPersoninvehicle.setSex(personinvehicle.getSex());
        oldPersoninvehicle.setFirstName(personinvehicle.getFirstName());
        oldPersoninvehicle.setLastName(personinvehicle.getLastName());
        oldPersoninvehicle.setMiddleName(personinvehicle.getMiddleName());
        oldPersoninvehicle.setAge(personinvehicle.getAge());
        oldPersoninvehicle.setAdditionalInfo(personinvehicle.getAdditionalInfo());
        oldPersoninvehicle.setAddress(personinvehicle.getAddress());
        oldPersoninvehicle.setPhoneNumber(personinvehicle.getPhoneNumber());
        oldPersoninvehicle.setVehicle(personinvehicle.getVehicle());
        oldPersoninvehicle.setPersonType(personinvehicle.getPersonType());
        oldPersoninvehicle.setRestraintUsed(personinvehicle.getRestraintUsed());
        oldPersoninvehicle.setInjuryClass(personinvehicle.getInjuryClass());
    	
		return personinvehicleRepository.save(oldPersoninvehicle);
	}).orElseThrow(null);
			
		}
	}
		
}

