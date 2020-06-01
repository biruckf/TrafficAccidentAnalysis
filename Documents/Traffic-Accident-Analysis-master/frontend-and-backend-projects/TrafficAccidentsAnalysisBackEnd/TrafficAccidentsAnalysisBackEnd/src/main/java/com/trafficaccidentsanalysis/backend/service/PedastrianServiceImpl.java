package com.trafficaccidentsanalysis.backend.service;

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
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.PedastrianRepository;
import com.trafficaccidentsanalysis.backend.repository.VehicleRepository;

@Service
public class PedastrianServiceImpl implements PedastrianService {
	@Autowired
	PedastrianRepository pedastrianRepository;
	@Autowired
	VehicleRepository vehicleRepository ;
	@Override
	public   List<Pedastrian>  getAllPedastrian(){
		return pedastrianRepository.findAll();	
	}
	@Override	
	public   Pedastrian savePedastrian(Pedastrian pedastrian) {
		return pedastrianRepository.save(pedastrian) ;
		
	}
	
	@Override	
	public ResponseEntity<?> deletePedastrian(Pedastrian pedastrian) {
		return (ResponseEntity<?>) pedastrianRepository.findById(pedastrian.getPedastrianid()).map(pedastrianToDelete->{
			pedastrianRepository.delete(pedastrianToDelete);
			return ResponseEntity.ok();
		}).orElseThrow(null);
		
	}
	@Override
	 public  Pedastrian updatePedastrian(Pedastrian pedastrian) {
		return pedastrianRepository.findById(pedastrian.getPedastrianid()).map(oldPedastrian->{
			oldPedastrian.setAdditionalInfo(pedastrian.getAdditionalInfo());
			oldPedastrian.setAddress(pedastrian.getAddress());
			oldPedastrian.setAge(pedastrian.getAge());
			oldPedastrian.setFirstName(pedastrian.getFirstName());
			oldPedastrian.setInjuryClass(pedastrian.getInjuryClass());
			oldPedastrian.setLastName(pedastrian.getLastName());
			oldPedastrian.setMiddleName(pedastrian.getMiddleName());
			oldPedastrian.setPhoneNumber(pedastrian.getPhoneNumber());
			oldPedastrian.setPositionDuringAccident(pedastrian.getPositionDuringAccident());
			oldPedastrian.setVehicle(pedastrian.getVehicle());
			oldPedastrian.setSex(pedastrian.getSex());
			return pedastrianRepository.save(oldPedastrian);
		}).orElseThrow(null);
				
			}
	
	@Override
	public Optional<Vehicle> savePedesterian(int id,AccidentDto2 accidentdto) {
		// TODO Auto-generated method stub
		//Set<Pedastrian> persons = new HashSet<Pedastrian>();
		
		System.out.println(id);
		
		Optional<Vehicle> v =   this.vehicleRepository.findById(id);
		     if(v.isPresent()) {
		    	 Vehicle vehicle = v.get();
		    	 UtilityDto utility = new UtilityDto();
		    	 
             /** List<Object> person = accidentdto.getPedistriansDto();
		    	 
		    	 person.forEach(perinveh ->{
		    		 Pedastrian p = new Pedastrian();
		 	    	  LinkedHashMap<Object,Object> x2 = (LinkedHashMap<Object, Object>) perinveh ;
		 	    	  String addinfo = (String) x2.get("firstnameDto");
		 	    	  System.out.println(addinfo );
		       	      String addressInfo = (String)  x2.get("lastnameDto");
		       	      System.out.println(addressInfo);
		       	      p.setAdditionalInfo(addinfo);
		       	      p.setAddress(addressInfo);
		       	      persons.add(p);  

		    		 
		    	 });*/
			
		    	  vehicle.setPedastrians(utility.pedastriandto(accidentdto));
				  this.vehicleRepository.save(vehicle);
		       }
		    
		    	 
		 		  
		return v;
		  
	}


		
		
	}

