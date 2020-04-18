package com.trafficaccidentsanalysis.backend.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	private String roadTypeDto;
	private String timeOfAccidentDto;
	private int uknownInjuryDto;
	private Date updatedByDto;
	private String weatherDuringAccidentDto;
	private Set<AttachmentDto> attachmentsDto;
	private Set<VehicleDto> vehiclesDto;
	public int getAccidentidDto() {
		return accidentidDto;
	}
	public void setAccidentidDto(int accidentidDto) {
		this.accidentidDto = accidentidDto;
	}
	public String getAccidentTypeDto() {
		return accidentTypeDto;
	}
	public void setAccidentTypeDto(String accidentTypeDto) {
		this.accidentTypeDto = accidentTypeDto;
	}
	public String getAdditionalInfoDto() {
		return additionalInfoDto;
	}
	public void setAdditionalInfoDto(String additionalInfoDto) {
		this.additionalInfoDto = additionalInfoDto;
	}
	public String getAddressLocationDto() {
		return addressLocationDto;
	}
	public void setAddressLocationDto(String addressLocationDto) {
		this.addressLocationDto = addressLocationDto;
	}
	public String getCityDto() {
		return cityDto;
	}
	public void setCityDto(String cityDto) {
		this.cityDto = cityDto;
	}
	public Date getDateCreatedDto() {
		return dateCreatedDto;
	}
	public void setDateCreatedDto(Date dateCreatedDto) {
		this.dateCreatedDto = dateCreatedDto;
	}
	public String getDateOfAccidentDto() {
		return dateOfAccidentDto;
	}
	public void setDateOfAccidentDto(String dateOfAccidentDto) {
		this.dateOfAccidentDto = dateOfAccidentDto;
	}
	public Date getDateUpdatedDto() {
		return dateUpdatedDto;
	}
	public void setDateUpdatedDto(Date dateUpdatedDto) {
		this.dateUpdatedDto = dateUpdatedDto;
	}
	public String getLatitudeDto() {
		return latitudeDto;
	}
	public void setLatitudeDto(String latitudeDto) {
		this.latitudeDto = latitudeDto;
	}
	public String getLegalRoadSpeedKmhDto() {
		return legalRoadSpeedKmhDto;
	}
	public void setLegalRoadSpeedKmhDto(String legalRoadSpeedKmhDto) {
		this.legalRoadSpeedKmhDto = legalRoadSpeedKmhDto;
	}
	public String getLogitudeDto() {
		return logitudeDto;
	}
	public void setLogitudeDto(String logitudeDto) {
		this.logitudeDto = logitudeDto;
	}
	public int getNumberOfModerateInjuryDto() {
		return numberOfModerateInjuryDto;
	}
	public void setNumberOfModerateInjuryDto(int numberOfModerateInjuryDto) {
		this.numberOfModerateInjuryDto = numberOfModerateInjuryDto;
	}
	public int getNumberOfDeathDto() {
		return numberOfDeathDto;
	}
	public void setNumberOfDeathDto(int numberOfDeathDto) {
		this.numberOfDeathDto = numberOfDeathDto;
	}
	public int getNumberOfMajorInjuryDto() {
		return numberOfMajorInjuryDto;
	}
	public void setNumberOfMajorInjuryDto(int numberOfMajorInjuryDto) {
		this.numberOfMajorInjuryDto = numberOfMajorInjuryDto;
	}
	public int getNumberOfMinorInjuryDto() {
		return numberOfMinorInjuryDto;
	}
	public void setNumberOfMinorInjuryDto(int numberOfMinorInjuryDto) {
		this.numberOfMinorInjuryDto = numberOfMinorInjuryDto;
	}
	public int getNumberOfPeopleInvolvedDto() {
		return numberOfPeopleInvolvedDto;
	}
	public void setNumberOfPeopleInvolvedDto(int numberOfPeopleInvolvedDto) {
		this.numberOfPeopleInvolvedDto = numberOfPeopleInvolvedDto;
	}
	public int getNumberOfVehiclesInvolvedDto() {
		return numberOfVehiclesInvolvedDto;
	}
	public void setNumberOfVehiclesInvolvedDto(int numberOfVehiclesInvolvedDto) {
		this.numberOfVehiclesInvolvedDto = numberOfVehiclesInvolvedDto;
	}
	public String getRegionDto() {
		return regionDto;
	}
	public void setRegionDto(String regionDto) {
		this.regionDto = regionDto;
	}
	public String getReportingOfficerNameDto() {
		return reportingOfficerNameDto;
	}
	public void setReportingOfficerNameDto(String reportingOfficerNameDto) {
		this.reportingOfficerNameDto = reportingOfficerNameDto;
	}
	public String getReportingOfficerPhoneDto() {
		return reportingOfficerPhoneDto;
	}
	public void setReportingOfficerPhoneDto(String reportingOfficerPhoneDto) {
		this.reportingOfficerPhoneDto = reportingOfficerPhoneDto;
	}
	public String getReportingOfficerStataionDto() {
		return reportingOfficerStataionDto;
	}
	public void setReportingOfficerStataionDto(String reportingOfficerStataionDto) {
		this.reportingOfficerStataionDto = reportingOfficerStataionDto;
	}
	public String getRoadClassificationDto() {
		return roadClassificationDto;
	}
	public void setRoadClassificationDto(String roadClassificationDto) {
		this.roadClassificationDto = roadClassificationDto;
	}
	public String getRoadConditionDto() {
		return roadConditionDto;
	}
	public void setRoadConditionDto(String roadConditionDto) {
		this.roadConditionDto = roadConditionDto;
	}
	public String getRoadTypeDto() {
		return roadTypeDto;
	}
	public void setRoadTypeDto(String roadTypeDto) {
		this.roadTypeDto = roadTypeDto;
	}
	public String getTimeOfAccidentDto() {
		return timeOfAccidentDto;
	}
	public void setTimeOfAccidentDto(String timeOfAccidentDto) {
		this.timeOfAccidentDto = timeOfAccidentDto;
	}
	public int getUknownInjuryDto() {
		return uknownInjuryDto;
	}
	public void setUknownInjuryDto(int uknownInjuryDto) {
		this.uknownInjuryDto = uknownInjuryDto;
	}
	public Date getUpdatedByDto() {
		return updatedByDto;
	}
	public void setUpdatedByDto(Date updatedByDto) {
		this.updatedByDto = updatedByDto;
	}
	public String getWeatherDuringAccidentDto() {
		return weatherDuringAccidentDto;
	}
	public void setWeatherDuringAccidentDto(String weatherDuringAccidentDto) {
		this.weatherDuringAccidentDto = weatherDuringAccidentDto;
	}
	public Set<AttachmentDto> getAttachmentsDto() {
		if(this.attachmentsDto == null) {
			this.attachmentsDto= new HashSet<AttachmentDto>();
		}
		return attachmentsDto;
	}
	public void setAttachmentsDto(Set<AttachmentDto> attachmentsDto) {
		if(this.attachmentsDto == null) {
			this.attachmentsDto= new HashSet<AttachmentDto>();
		}
		for(AttachmentDto a:attachmentsDto) {
			getAttachmentsDto().add(a);
			
		}
		
	}
	public void addAttachmentDto(AttachmentDto attachmentDto) {
		if(this.attachmentsDto == null) {
			this.attachmentsDto= new HashSet<AttachmentDto>();
		}
			getAttachmentsDto().add(attachmentDto);
		
	}
	
	public Set<VehicleDto> getVehiclesDto() {
		if(this.vehiclesDto == null) {
			this.vehiclesDto= new HashSet<VehicleDto>();
		}
		return vehiclesDto;
	}
	public void setVehiclesDto(Set<VehicleDto> vehiclesDto) {
		if(this.vehiclesDto == null) {
			this.vehiclesDto= new HashSet<VehicleDto>();
		}
		for(VehicleDto v:vehiclesDto) {
			getVehiclesDto().add(v);
			
		}
		
	}
	public void addVehicleDto(VehicleDto vehicleDto) {
		if(this.vehiclesDto == null) {
			this.vehiclesDto= new HashSet<VehicleDto>();
		}
			getVehiclesDto().add(vehicleDto);
			
		
	}
	
}
