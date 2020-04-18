package com.trafficaccidentsanalysis.backend.dotconverter;

import java.util.HashSet;
import java.util.Set;

import com.trafficaccidentsanalysis.backend.dto.MotoristDto;
import com.trafficaccidentsanalysis.backend.model.Motorist;

public class MotoristDtoConverter {

	public Motorist motoristDtoToMotoristConverter(MotoristDto motoristDto) {
		Motorist motorist=new Motorist();
		
		motorist.setMotoristid(motoristDto.getMotoristidDto());
		motorist.setAdditionalInfo(motoristDto.getAdditionalInfoDto());
		motorist.setDateUpdated(motoristDto.getDateUpdatedDto());
		motorist.setHasLicense(motoristDto.getHasLicenseDto());
		motorist.setIssuedCountry(motoristDto.getIssuedCountryDto());
		motorist.setIssuedDate(motoristDto.getIssuedDateDto());
		motorist.setIssuedState(motoristDto.getIssuedStateDto());
		motorist.setLicenseNumber(motoristDto.getLicenseNumberDto());
		motorist.setMotorisReadiness(motoristDto.getMotorisReadinessDto());
		
		return motorist;
	}
	
	public Set<Motorist> setOfMotoristDtoToSetOfMotoristConverter(Set<MotoristDto> motoristsDto) {
		
	Set<Motorist> motorists=new HashSet<Motorist>();
	
	motoristsDto.forEach(motoristDto->{
		motorists.add(motoristDtoToMotoristConverter(motoristDto));
	});
	
	return motorists;
	}
}
