package com.trafficaccidentsanalysis.backend.dotconverter;

import java.util.HashSet;
import java.util.Set;

import com.trafficaccidentsanalysis.backend.dto.PedastrianDto;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;

public class PedastrianDtoConverter {

	public Pedastrian pedastrianDtoToPedastrianConverter(PedastrianDto pedastriandto) {
		Pedastrian pedastrian=new Pedastrian();
		
		pedastrian.setPedastrianid(pedastriandto.getPedastrianidDto());
		pedastrian.setAdditionalInfo(pedastriandto.getAdditionalInfoDto());
		pedastrian.setAddress(pedastriandto.getAddressDto());
		pedastrian.setAge(pedastriandto.getAgeDto());
		pedastrian.setFirstName(pedastriandto.getFirstNameDto());
		pedastrian.setInjuryClass(pedastriandto.getInjuryClassDto());
		pedastrian.setLastName(pedastriandto.getLastNameDto());
		pedastrian.setMiddleName(pedastriandto.getMiddleNameDto());
		pedastrian.setPhoneNumber(pedastriandto.getPhoneNumberDto());
		pedastrian.setPositionDuringAccident(pedastriandto.getPositionDuringAccidentDto());
		pedastrian.setSex(pedastriandto.getSexDto());
		
		return pedastrian;
	}
	
	public Set<Pedastrian> setOfPedastrianDtoToSetOfPedastrianConverter(Set<PedastrianDto> pedastriansdto) {
	
		Set<Pedastrian> pedastrians=new HashSet<Pedastrian>();
		if(pedastriansdto==null) {
			pedastriansdto=new HashSet<PedastrianDto>();
		}
		pedastriansdto.forEach(pedastrianDto->{
			pedastrians.add(pedastrianDtoToPedastrianConverter(pedastrianDto));
		});
		
		return pedastrians;
	}
}
