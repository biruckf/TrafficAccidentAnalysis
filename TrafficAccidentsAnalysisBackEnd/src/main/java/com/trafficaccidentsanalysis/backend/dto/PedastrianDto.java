package com.trafficaccidentsanalysis.backend.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class PedastrianDto {
	private int pedastrianidDto;
	private String additionalInfoDto;
	private String addressDto;
	private int ageDto;
	private Date dateCreatedDto;
	private String firstNameDto;
	private String injuryClassDto;
	private String lastNameDto;
	private String middleNameDto;
	private String phoneNumberDto;
	private String positionDuringAccidentDto;
	private String sexDto;
	
	public PedastrianDto() {
		super();
	}

	public int getPedastrianidDto() {
		return pedastrianidDto;
	}

	public void setPedastrianidDto(int pedastrianidDto) {
		this.pedastrianidDto = pedastrianidDto;
	}

	public String getAdditionalInfoDto() {
		return additionalInfoDto;
	}

	public void setAdditionalInfoDto(String additionalInfoDto) {
		this.additionalInfoDto = additionalInfoDto;
	}

	public String getAddressDto() {
		return addressDto;
	}

	public void setAddressDto(String addressDto) {
		this.addressDto = addressDto;
	}

	public int getAgeDto() {
		return ageDto;
	}

	public void setAgeDto(int ageDto) {
		this.ageDto = ageDto;
	}

	public Date getDateCreatedDto() {
		return dateCreatedDto;
	}

	public void setDateCreatedDto(Date dateCreatedDto) {
		this.dateCreatedDto = dateCreatedDto;
	}

	public String getFirstNameDto() {
		return firstNameDto;
	}

	public void setFirstNameDto(String firstNameDto) {
		this.firstNameDto = firstNameDto;
	}

	public String getInjuryClassDto() {
		return injuryClassDto;
	}

	public void setInjuryClassDto(String injuryClassDto) {
		this.injuryClassDto = injuryClassDto;
	}

	public String getLastNameDto() {
		return lastNameDto;
	}

	public void setLastNameDto(String lastNameDto) {
		this.lastNameDto = lastNameDto;
	}

	public String getMiddleNameDto() {
		return middleNameDto;
	}

	public void setMiddleNameDto(String middleNameDto) {
		this.middleNameDto = middleNameDto;
	}

	public String getPhoneNumberDto() {
		return phoneNumberDto;
	}

	public void setPhoneNumberDto(String phoneNumberDto) {
		this.phoneNumberDto = phoneNumberDto;
	}

	public String getPositionDuringAccidentDto() {
		return positionDuringAccidentDto;
	}

	public void setPositionDuringAccidentDto(String positionDuringAccidentDto) {
		this.positionDuringAccidentDto = positionDuringAccidentDto;
	}

	public String getSexDto() {
		return sexDto;
	}

	public void setSexDto(String sexDto) {
		this.sexDto = sexDto;
	}
	
	
	


}
