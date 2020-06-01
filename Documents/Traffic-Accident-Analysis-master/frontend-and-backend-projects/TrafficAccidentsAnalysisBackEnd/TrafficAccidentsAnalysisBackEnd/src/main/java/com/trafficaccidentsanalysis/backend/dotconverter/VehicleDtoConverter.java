package com.trafficaccidentsanalysis.backend.dotconverter;

import java.util.HashSet;
import java.util.Set;

import com.trafficaccidentsanalysis.backend.dto.VehicleDto;
import com.trafficaccidentsanalysis.backend.model.Vehicle;

public class VehicleDtoConverter {
	public Vehicle vehicleDtoToVehicleConverter(VehicleDto vehicleDto) {
		Vehicle vehicle=new Vehicle();
		
		vehicle.setVehicleid(vehicleDto.getVehicleidDto());
		vehicle.setColor(vehicleDto.getColorDto());
		vehicle.setMake(vehicleDto.getMakeDto());
		vehicle.setModel(vehicleDto.getModelDto());
		vehicle.setPlateNumber(vehicleDto.getPlateNumberDto());
		vehicle.setVehicle_speed_before_accident_KMh(vehicleDto.getVehicle_speed_before_accident_KMhDto());
		vehicle.setVehicleOwner(vehicleDto.getVehicleOwnerDto());
		vehicle.setVehicleType(vehicleDto.getVehicleTypeDto());
		vehicle.setVin(vehicleDto.getVinDto());
		vehicle.setYear(vehicleDto.getYearDto());
		vehicle.setAdditionalInfo(vehicleDto.getAdditionalInfoDto());
		vehicle.setDamageClass(vehicleDto.getDamageClassDto());
		vehicle.setAccidentPosition(vehicleDto.getAccidentPositionDto());
		vehicle.setHasInsurance(vehicleDto.getHasInsuranceDto());
		vehicle.setMannerOfCollision(vehicleDto.getMannerOfCollisionDto());
		vehicle.setPersoninvehicles(new PersonInVehicleDtoConverter().
				setOfpersoninVehicleDtoToPersoninsVehicleConverter
				(vehicleDto.getPersoninvehiclesDto()));
		vehicle.setMotorists(new MotoristDtoConverter().
				setOfMotoristDtoToSetOfMotoristConverter(vehicleDto.getMotoristsDto()));
		vehicle.setPedastrians(new PedastrianDtoConverter()
				.setOfPedastrianDtoToSetOfPedastrianConverter(vehicleDto.getPedastriansDto()));
		vehicle.setDateUpdated(vehicleDto.getDateUpdatedDto());
		
		return vehicle;
	}
	
	public Set<Vehicle> setOfVehicleDtoToVehicleConverter(Set<VehicleDto> vehiclesDto) {
		Set<Vehicle> vehicles=new HashSet<Vehicle>();
		if(vehiclesDto == null) {
			vehiclesDto= new HashSet<VehicleDto>();
		}
		vehiclesDto.forEach(vehicleDto->{
			vehicles.add(vehicleDtoToVehicleConverter(vehicleDto));
		});
	return vehicles;
	}

}
