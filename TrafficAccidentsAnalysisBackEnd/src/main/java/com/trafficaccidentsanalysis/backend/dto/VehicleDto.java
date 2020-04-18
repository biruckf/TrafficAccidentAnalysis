package com.trafficaccidentsanalysis.backend.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VehicleDto {
	private int vehicleidDto;
	private String accidentPositionDto;
	private String additionalInfoDto;
	private String colorDto;
	private String damageClassDto;
	private Date dateCreatedDto;
	private Date dateUpdatedDto;
	private byte hasInsuranceDto;
	private String makeDto;
	private String mannerOfCollisionDto;
	private String modelDto;
	private String plateNumberDto;
	private String vehicleOwnerDto;
	private int vehicle_speed_before_accident_KMhDto;
	private String vehicleTypeDto;
	private String vinDto;
	private int yearDto;
	private Set<MotoristDto> motoristsDto;
	private Set<PedastrianDto> pedastriansDto;
	private Set<PersoninvehicleDto> personinvehiclesDto;
	public VehicleDto() {
		super();
	}
	
	public VehicleDto(String accidentPositionDto, String additionalInfoDto, String colorDto, String damageClassDto,
			Date dateCreatedDto, Date dateUpdatedDto, byte hasInsuranceDto, String makeDto, String mannerOfCollisionDto,
			String modelDto, String plateNumberDto, String vehicleOwnerDto, int vehicle_speed_before_accident_KMhDto,
			String vehicleTypeDto, String vinDto, int yearDto) {
		super();
		this.accidentPositionDto = accidentPositionDto;
		this.additionalInfoDto = additionalInfoDto;
		this.colorDto = colorDto;
		this.damageClassDto = damageClassDto;
		this.dateCreatedDto = dateCreatedDto;
		this.dateUpdatedDto = dateUpdatedDto;
		this.hasInsuranceDto = hasInsuranceDto;
		this.makeDto = makeDto;
		this.mannerOfCollisionDto = mannerOfCollisionDto;
		this.modelDto = modelDto;
		this.plateNumberDto = plateNumberDto;
		this.vehicleOwnerDto = vehicleOwnerDto;
		this.vehicle_speed_before_accident_KMhDto = vehicle_speed_before_accident_KMhDto;
		this.vehicleTypeDto = vehicleTypeDto;
		this.vinDto = vinDto;
		this.yearDto = yearDto;
	}

	public int getVehicleidDto() {
		return vehicleidDto;
	}
	public void setVehicleidDto(int vehicleidDto) {
		this.vehicleidDto = vehicleidDto;
	}
	public String getAccidentPositionDto() {
		return accidentPositionDto;
	}
	public void setAccidentPositionDto(String accidentPositionDto) {
		this.accidentPositionDto = accidentPositionDto;
	}
	public String getAdditionalInfoDto() {
		return additionalInfoDto;
	}
	public void setAdditionalInfoDto(String additionalInfoDto) {
		this.additionalInfoDto = additionalInfoDto;
	}
	public String getColorDto() {
		return colorDto;
	}
	public void setColorDto(String colorDto) {
		this.colorDto = colorDto;
	}
	public String getDamageClassDto() {
		return damageClassDto;
	}
	public void setDamageClassDto(String damageClassDto) {
		this.damageClassDto = damageClassDto;
	}
	public Date getDateCreatedDto() {
		return dateCreatedDto;
	}
	public void setDateCreatedDto(Date dateCreatedDto) {
		this.dateCreatedDto = dateCreatedDto;
	}
	public Date getDateUpdatedDto() {
		return dateUpdatedDto;
	}
	public void setDateUpdatedDto(Date dateUpdatedDto) {
		this.dateUpdatedDto = dateUpdatedDto;
	}
	public byte getHasInsuranceDto() {
		return hasInsuranceDto;
	}
	public void setHasInsuranceDto(byte hasInsuranceDto) {
		this.hasInsuranceDto = hasInsuranceDto;
	}
	public String getMakeDto() {
		return makeDto;
	}
	public void setMakeDto(String makeDto) {
		this.makeDto = makeDto;
	}
	public String getMannerOfCollisionDto() {
		return mannerOfCollisionDto;
	}
	public void setMannerOfCollisionDto(String mannerOfCollisionDto) {
		this.mannerOfCollisionDto = mannerOfCollisionDto;
	}
	public String getModelDto() {
		return modelDto;
	}
	public void setModelDto(String modelDto) {
		this.modelDto = modelDto;
	}
	public String getPlateNumberDto() {
		return plateNumberDto;
	}
	public void setPlateNumberDto(String plateNumberDto) {
		this.plateNumberDto = plateNumberDto;
	}
	public String getVehicleOwnerDto() {
		return vehicleOwnerDto;
	}
	public void setVehicleOwnerDto(String vehicleOwnerDto) {
		this.vehicleOwnerDto = vehicleOwnerDto;
	}
	public int getVehicle_speed_before_accident_KMhDto() {
		return vehicle_speed_before_accident_KMhDto;
	}
	public void setVehicle_speed_before_accident_KMhDto(int vehicle_speed_before_accident_KMhDto) {
		this.vehicle_speed_before_accident_KMhDto = vehicle_speed_before_accident_KMhDto;
	}
	public String getVehicleTypeDto() {
		return vehicleTypeDto;
	}
	public void setVehicleTypeDto(String vehicleTypeDto) {
		this.vehicleTypeDto = vehicleTypeDto;
	}
	public String getVinDto() {
		return vinDto;
	}
	public void setVinDto(String vinDto) {
		this.vinDto = vinDto;
	}
	public int getYearDto() {
		return yearDto;
	}
	public void setYearDto(int yearDto) {
		this.yearDto = yearDto;
	}
	public Set<MotoristDto> getMotoristsDto() {
		return motoristsDto;
	}
	public void setMotoristsDto(Set<MotoristDto> motoristsDto) {
		if(this.motoristsDto==null) {
			this.motoristsDto=new HashSet<MotoristDto>();
		}
		this.motoristsDto = motoristsDto;
	}
	public Set<PedastrianDto> getPedastriansDto() {
		return pedastriansDto;
	}
	public void setPedastriansDto(Set<PedastrianDto> pedastriansDto) {
		if(this.pedastriansDto==null) {
			this.pedastriansDto=new HashSet<PedastrianDto>();
		}
		this.pedastriansDto = pedastriansDto;
	}
	public Set<PersoninvehicleDto> getPersoninvehiclesDto() {
		return personinvehiclesDto;
	}
	public void setPersoninvehiclesDto(Set<PersoninvehicleDto> personinvehiclesDto) {
		if(this.personinvehiclesDto==null) {
			this.personinvehiclesDto=new HashSet<PersoninvehicleDto>();
		}
		this.personinvehiclesDto = personinvehiclesDto;
	}
	
	
	

}
