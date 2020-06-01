package com.trafficaccidentsanalysis.backend.dotconverter;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;

public class AccidentDtoConverter {
	public Accident AccidentDtoToAccidentConverter(AccidentDto accidentDto) {
		Accident accident=new Accident();
		
		accident.setAdditionalInfo(accidentDto.getAdditionalInfoDto());
		accident.setAccidentType(accidentDto.getAccidentTypeDto());
		accident.setAddressLocation(accidentDto.getAddressLocationDto());
		accident.setCity(accidentDto.getCityDto());
		accident.setDateCreated(accidentDto.getDateCreatedDto());
		accident.setDateOfAccident(accidentDto.getDateOfAccidentDto());
		accident.setDateUpdated(accidentDto.getDateUpdatedDto());
		accident.setLatitude(accidentDto.getLatitudeDto());
		accident.setLegalRoadSpeedKmh(accidentDto.getLegalRoadSpeedKmhDto());
		accident.setLogitude(accidentDto.getLogitudeDto());
		accident.setNumberOfDeath(accidentDto.getNumberOfDeathDto());
		accident.setNumberOfMajorInjury(accidentDto.getNumberOfMajorInjuryDto());
		accident.setNumberOfMinorInjury(accidentDto.getNumberOfMinorInjuryDto());
		accident.setNumberOfModerateInjury(accidentDto.getNumberOfModerateInjuryDto());
		accident.setNumberOfPeopleInvolved(accidentDto.getNumberOfPeopleInvolvedDto());
		accident.setNumberOfVehiclesInvolved(accidentDto.getNumberOfVehiclesInvolvedDto());
		accident.setRegion(accidentDto.getRegionDto());
		accident.setReportingOfficerName(accidentDto.getReportingOfficerNameDto());
		accident.setReportingOfficerPhone(accidentDto.getReportingOfficerPhoneDto());
		accident.setReportingOfficerStataion(accidentDto.getReportingOfficerStataionDto());
		accident.setRoadClassification(accidentDto.getRoadClassificationDto());
		accident.setRoadCondition(accidentDto.getRoadConditionDto());
		accident.setRoadType(accidentDto.getRoadTypeDto());
		accident.setTimeOfAccident(accidentDto.getTimeOfAccidentDto());
		accident.setUknownInjury(accidentDto.getUknownInjuryDto());
		accident.setUpdatedBy(accidentDto.getUpdatedByDto());
		accident.setAttachments(new AttachmentDtoConverter()
				.convertSetOfAttachmentDtoTOSetOfAttachment(
						accidentDto.getAttachmentsDto()));
		accident.setVehicles(new VehicleDtoConverter().
				setOfVehicleDtoToVehicleConverter(accidentDto.getVehiclesDto()));
		accident.setWeatherDuringAccident(accidentDto.getWeatherDuringAccidentDto());
		
		return accident;
		
	}
}
