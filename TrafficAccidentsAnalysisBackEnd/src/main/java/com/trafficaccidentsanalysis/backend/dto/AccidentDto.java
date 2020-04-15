package com.trafficaccidentsanalysis.backend.dto;

import java.util.Date;
import java.util.List;

import com.trafficaccidentsanalysis.backend.model.Attachment;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

public class AccidentDto {
	private int accidentidDto;
	private String accidentTypeDto;
	private String additionalInfoDto;
	private String addressLocationDto;
	private String cityDto;
	private Date dateCreatedDto;
	private String dateOfAccidentDto;
	private Date dateUpdatedDto;
	private String latitudeDto;
	private String legalRoadSpeedKmhDto;
	private String logitudeDto;
	private int numberOfModerateInjuryDto;
	private int numberOfDeathDto;
	private int numberOfMajorInjuryDto;
	private int numberOfMinorInjuryDto;
	private int numberOfPeopleInvolvedDto;
	private int numberOfVehiclesInvolvedDto;
	private String regionDto;
	private String reportingOfficerNameDto;
	private String reportingOfficerPhoneDto;
	private String reportingOfficerStataionDto;
	private String roadClassificationDto;
	private String roadConditionDto;
	private String roadTypeDtoDto;
	private String timeOfAccidentDto;
	private int uknownInjuryDto;
	private Date updatedByDto;
	private String weatherDuringAccidentDto;
	private List<AttachmentDto> attachmentsDto;
	private List<VehicleDto> vehiclesDto;
	
}
