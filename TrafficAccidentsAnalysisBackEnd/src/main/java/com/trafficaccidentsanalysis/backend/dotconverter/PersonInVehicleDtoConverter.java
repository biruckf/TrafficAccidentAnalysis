package com.trafficaccidentsanalysis.backend.dotconverter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.trafficaccidentsanalysis.backend.dto.PersoninvehicleDto;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;

public class PersonInVehicleDtoConverter {
	public Personinvehicle personinVehicleDtoToPersoninVehicleConverter(PersoninvehicleDto personInVehicleDto) {
		Personinvehicle personinVehicle=new Personinvehicle();
		
		personinVehicle.setPersonid(personInVehicleDto.getPersonidDto());
		personinVehicle.setDateUpdated(personInVehicleDto.getDateUpdatedDto());
		personinVehicle.setSex(personInVehicleDto.getSexDto());
		personinVehicle.setFirstName(personInVehicleDto.getFirstNameDto());
		personinVehicle.setLastName(personInVehicleDto.getLastNameDto());
		personinVehicle.setMiddleName(personInVehicleDto.getMiddleNameDto());
		personinVehicle.setAge(personInVehicleDto.getAgeDto());
		personinVehicle.setAdditionalInfo(personInVehicleDto.getAdditionalInfoDto());
		personinVehicle.setAddress(personInVehicleDto.getAddressDto());
		personinVehicle.setPhoneNumber(personInVehicleDto.getPhoneNumberDto());
		personinVehicle.setPersonType(personInVehicleDto.getPersonTypeDto());
		personinVehicle.setRestraintUsed(personInVehicleDto.getRestraintUsedDto());
		personinVehicle.setInjuryClass(personInVehicleDto.getInjuryClassDto());
		
		return personinVehicle;

	}
	
	public Set<Personinvehicle> setOfpersoninVehicleDtoToPersoninsVehicleConverter(Set<PersoninvehicleDto> personsInVehicleDto) {
		Set<Personinvehicle> personsinVehicle=new HashSet<Personinvehicle>();
		
		personsInVehicleDto.forEach(personsDto->{
			personsinVehicle.add(personinVehicleDtoToPersoninVehicleConverter(personsDto));
		});
		
		return personsinVehicle;
	}
}
