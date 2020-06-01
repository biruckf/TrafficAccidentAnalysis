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

import com.trafficaccidentsanalysis.backend.dto.AccidentDto2;
import com.trafficaccidentsanalysis.backend.dtoUtility.UtilityDto;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.MotoristRepository;
import com.trafficaccidentsanalysis.backend.repository.VehicleRepository;


	@Service
	public class MotoristServiceImpl implements MotoristService{
		@Autowired
		MotoristRepository motoristRepository;
		@Autowired
		VehicleRepository vehicleRepository ;

		@Override
		public List<Motorist> getAllMotorists() {
			
			return motoristRepository.findAll();
		}
		@Override
		public Motorist saveMotorist(Motorist motorist) {
			
			return motoristRepository.save(motorist) ;
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
		@Override
		public Optional<Vehicle> saveMotoristinvehicle(int id,AccidentDto2 accidentdto) {
			// TODO Auto-generated method stub
			//Set<Motorist> persons = new HashSet<Motorist>();
			
			System.out.println(id);
			
			Optional<Vehicle> v =   this.vehicleRepository.findById(id);
			       
			     if(v.isPresent()) {
			    	 Vehicle vehicle = v.get();
			    	  UtilityDto utility = new UtilityDto() ;
			    	   /**System.out.println(vehicle.getaccident_id());
			    	   vehicle.setAccidentPosition("top");
			    	   List<Object> person = accidentdto.getMotoristDto();
				    	 
				    	 person.forEach(perinveh ->{
				    		 Motorist m = new Motorist();
				 	    	  LinkedHashMap<Object,Object> x2 = (LinkedHashMap<Object, Object>) perinveh ;
				 	    	  String addinfo = (String) x2.get("additionalInfoDto");
				 	    	  System.out.println(addinfo );
				       	      String addressInfo = (String)  x2.get("educationDto");
				       	      System.out.println(addressInfo);
				       	      m.setAdditionalInfo(addinfo);
				       	      m.setEducation(addressInfo);
				       	      persons.add(m);
			    		 
			    	 });*/
				if(vehicle !=null) {
					  vehicle.setMotorists(utility.motoristdto(accidentdto));
					  this.vehicleRepository.save(vehicle);
				}
			    	
			       }
			    
			    	 
			 		  
			return v;
			     
			  
		}



	}
		
		