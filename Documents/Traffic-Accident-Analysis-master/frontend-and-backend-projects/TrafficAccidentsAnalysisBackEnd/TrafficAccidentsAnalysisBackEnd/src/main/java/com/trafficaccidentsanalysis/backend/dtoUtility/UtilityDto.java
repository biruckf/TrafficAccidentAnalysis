package com.trafficaccidentsanalysis.backend.dtoUtility;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto2;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;

public class UtilityDto {
	
	public Set<Personinvehicle>  persondto(AccidentDto2 acc) {
		Set<Personinvehicle> persons = new HashSet<Personinvehicle>();
	    List<Object> person = acc.getPersonsinVehicle();
    	 
    	 person.forEach(perinveh ->{
    		 Personinvehicle p = new Personinvehicle();
 	    	  LinkedHashMap<Object,Object> personsinvehicle = (LinkedHashMap<Object, Object>) perinveh ;
 	    	  
 	    	  String addinfo = (String) personsinvehicle.get("additionalInfoDto");
       	      String addressInfo = (String)  personsinvehicle.get("addressDto");
       	      
              String firstName = (String)  personsinvehicle.get("firstNameDto");
       	      String injuryClass = (String)  personsinvehicle.get("injuryClassDto");
       	      String lastName = (String)  personsinvehicle.get("lastNameDto");
       	      String middleName = (String)  personsinvehicle.get("middleNameDto");
       	      String personType = (String)  personsinvehicle.get("personTypeDto");
       	      String phoneNumber = (String)  personsinvehicle.get("phoneNumberDto");
       	      String restraintUsed = (String)  personsinvehicle.get("restraintUsedDto");
       	      String sex = (String)  personsinvehicle.get("sexDto");
       	     
       	      p.setAdditionalInfo(addinfo);
       	      p.setAddress(addressInfo);
       	      
              p.setFirstName(firstName);
            	p.setLastName(lastName);
       	     p.setMiddleName(middleName);
         	p.setPersonType(personType);
         	p.setPhoneNumber(phoneNumber);
        	p.setRestraintUsed(restraintUsed);
        	p.setSex(sex);
       	 p.setInjuryClass(injuryClass);
       	      
       	      
       	      
       	      
       	      
       	      
       	      
       	      
       	      
       	      
       	      
       	      
       	      
       	      persons.add(p);
		
      
		
	});
    	 return persons;

}
	public Set<Pedastrian>  pedastriandto(AccidentDto2 acc) {
		Set<Pedastrian> persons = new HashSet<Pedastrian>();
	    List<Object> person = acc.getPedistriansDto();
    	 
    	 person.forEach(perinveh ->{
    		 Pedastrian p = new Pedastrian();
 	    	  LinkedHashMap<Object,Object> pedastrian= (LinkedHashMap<Object, Object>) perinveh ;
 	    	  
 	    	  String firstname = (String) pedastrian.get("firstNameDto");
       	      String lastname = (String)  pedastrian.get("lastNameDto");
       	   String additionalInfo = (String)  pedastrian.get("additionalInfoDto");
       	String address = (String)  pedastrian.get("addressDto");
       	String injuryClass = (String)  pedastrian.get("injuryClassDto");
       	String middleName = (String)  pedastrian.get("middleNameDto");
       	String phoneNumber = (String)  pedastrian.get("phoneNumberDto");
       	String positionDuringAccident = (String)  pedastrian.get("positionDuringAccidentDto");
       	String sex = (String)  pedastrian.get("sexDto");
       	     
       	      p.setFirstName(firstname);
       	      p.setLastName(lastname);
       	      p.setAdditionalInfo(additionalInfo);
           	p.setAddress(address);
       	p.setInjuryClass(injuryClass);
       	p.setMiddleName(middleName);
       	p.setPhoneNumber(phoneNumber);
       	p.setPositionDuringAccident(positionDuringAccident);
       	p.setSex(sex);
       	      
       	      
       	      
       	      
       	      
       	      persons.add(p);
		
       
   	   
   	    
   	    
		
	});
    	 return persons;

}
	public Set<Motorist>  motoristdto(AccidentDto2 acc) {
		Set<Motorist> motorists = new HashSet<Motorist>();
	    List<Object> person = acc.getMotoristDto();
    	 
    	     person.forEach(perinveh ->{
    	 	 Motorist m = new Motorist();
 	         LinkedHashMap<Object,Object> motorist = (LinkedHashMap<Object, Object>) perinveh ;
 	    	  
 	         String addinfo = (String) motorist.get("additionalInfoDto");
 	         String issuedState = (String)  motorist.get("issuedStateDto");
     	     String licenseNumber = (String)  motorist.get("licenseNumberDto");
     	    
 	         String issuedCountry = (String)  motorist.get("issuedCountryDto");
 	         String motorisReadiness = (String)  motorist.get("motorisReadinessDto");
 	        
 	         String addressInfo = (String)  motorist.get("educationDto");
 	         
      	    
      	      
      	     
       	      m.setAdditionalInfo(addinfo);
    	      m.setEducation(addressInfo);
    	      m.setIssuedState(issuedState);
    	      m.setLicenseNumber(licenseNumber);
    	      
    	      m.setIssuedCountry(issuedCountry);
    	      m.setMotorisReadiness(motorisReadiness);
    	      
    	      
    	      
       	   
       	      motorists.add(m);
		
		
		
	      });
    	        return motorists;

}
}
