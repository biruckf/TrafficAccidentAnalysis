package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.AccidentRepository;
import com.trafficaccidentsanalysis.backend.repository.MotoristRepository;
import com.trafficaccidentsanalysis.backend.repository.PedastrianRepository;
import com.trafficaccidentsanalysis.backend.repository.PersoninvehicleRepository;
import com.trafficaccidentsanalysis.backend.repository.VehicleRepository;

@Service
public class AccidentServiceImpl implements AccidentService {
	@Autowired
	AccidentRepository accidentRepository;
	@Autowired
	VehicleService vehicleService;
	@Autowired
	PersoninvehicleService personInVehicleService;
	@Autowired
	MotoristService moteristService;
	@Autowired
	PedastrianService pedisteriananService;
	Accident accident=new Accident();
	Vehicle vehicle=new Vehicle();

	@Override
	public List<Accident> getAllAccident() {
		
		return accidentRepository.findAll();
	}

	@Override
	public Accident saveAccident(AccidentDto accidentDto) {
	accident=new Accident(accidentDto.getAccidentTypeDto(),accidentDto.getAdditionalInfoDto(),accidentDto.getAddressLocationDto()
				,accidentDto.getCityDto(),accidentDto.getDateCreatedDto(),accidentDto.getDateOfAccidentDto()
				,accidentDto.getDateUpdatedDto(),accidentDto.getLatitudeDto(),accidentDto.getLegalRoadSpeedKmhDto(),accidentDto.getLogitudeDto(),
				accidentDto.getNumberOfModerateInjuryDto(),accidentDto.getNumberOfDeathDto(),accidentDto.getNumberOfMajorInjuryDto(),
				accidentDto.getNumberOfMinorInjuryDto(),accidentDto.getNumberOfPeopleInvolvedDto(),accidentDto.getNumberOfVehiclesInvolvedDto(),
				accidentDto.getRegionDto(),accidentDto.getReportingOfficerNameDto(),accidentDto.getReportingOfficerPhoneDto(),
				accidentDto.getReportingOfficerStataionDto(),accidentDto.getRoadClassificationDto(),accidentDto.getRoadConditionDto(),
				accidentDto.getRoadTypeDtoDto(),accidentDto.getTimeOfAccidentDto(),accidentDto.getUknownInjuryDto(),accidentDto.getUpdatedByDto(),
				accidentDto.getWeatherDuringAccidentDto());
		
		accident=accidentRepository.save(accident);
		
		accidentDto.getVehiclesDto().forEach(vehicleDto->{
			vehicle=new Vehicle(vehicleDto.getAccidentPositionDto(),vehicleDto.getAdditionalInfoDto(),vehicleDto.getColorDto(),
					vehicleDto.getDamageClassDto(),vehicleDto.getDateCreatedDto(),vehicleDto.getDateUpdatedDto(),vehicleDto.getHasInsuranceDto(),
					vehicleDto.getMakeDto(),vehicleDto.getMannerOfCollisionDto(),vehicleDto.getModelDto(),vehicleDto.getPlateNumberDto(),
					vehicleDto.getVehicleOwnerDto(),vehicleDto.getVehicle_speed_before_accident_KMhDto(),vehicleDto.getVehicleTypeDto(),
					vehicleDto.getVinDto(),vehicleDto.getYearDto(),accident);
			
			vehicle=vehicleService.saveVehicle(vehicle);
			
			Motorist motorist=new Motorist(vehicleDto.getMotoristsDto().get(0).getAdditionalInfoDto(),vehicleDto.getMotoristsDto().get(0).getDateCreatedDto(),
					vehicleDto.getMotoristsDto().get(0).getDateUpdatedDto(),vehicleDto.getMotoristsDto().get(0).getEducationDto(),
					vehicleDto.getMotoristsDto().get(0).getHasLicenseDto(),vehicleDto.getMotoristsDto().get(0).getIssuedCountryDto(),
					vehicleDto.getMotoristsDto().get(0).getIssuedDateDto(),vehicleDto.getMotoristsDto().get(0).getIssuedStateDto(),
					vehicleDto.getMotoristsDto().get(0).getLicenseNumberDto(),vehicleDto.getMotoristsDto().get(0).getMotorisReadinessDto(),
				     vehicle);
			motorist=moteristService.saveMotorist(motorist);
			
			vehicleDto.getPedastriansDto().forEach(pedastrianDto->{
				Pedastrian pedastrian=new Pedastrian(pedastrianDto.getAdditionalInfoDto(),pedastrianDto.getAddressDto(),pedastrianDto.getAgeDto(),
						pedastrianDto.getDateCreatedDto(),pedastrianDto.getFirstNameDto(),
						pedastrianDto.getInjuryClassDto(),pedastrianDto.getLastNameDto(),pedastrianDto.getMiddleNameDto(),pedastrianDto.getPhoneNumberDto(),
						pedastrianDto.getPositionDuringAccidentDto(),pedastrianDto.getSexDto(),vehicle);
				
				pedastrian=pedisteriananService.savePedastrian(pedastrian);
			
				vehicleDto.getPersoninvehiclesDto().forEach(personDto->{
					Personinvehicle personinvehicle=new Personinvehicle(personDto.getAdditionalInfoDto(),personDto.getAddressDto(),personDto.getAgeDto(),
							personDto.getDateCreatedDto(),personDto.getDateUpdatedDto(),
							personDto.getFirstNameDto(),personDto.getInjuryClassDto(),personDto.getLastNameDto(),personDto.getMiddleNameDto(),
							personDto.getPersonTypeDto(),personDto.getPhoneNumberDto(),personDto.getRestraintUsedDto(),personDto.getSexDto(),vehicle);
					
					personinvehicle=personInVehicleService.savePersoninvehicle(personinvehicle);
				});
			});
			
			
			
		});
		
		return accident;
	}

	@Override
	public ResponseEntity<?> deleteAccident(Accident accident) {
		
		return (ResponseEntity<?>)accidentRepository.findById(accident.getAccidentid()).map(accidentToDelete->{
			accidentRepository.delete(accidentToDelete);
			return ResponseEntity.ok();
		}).orElseThrow(null);
		
		}
	

	@Override
	public Accident updateAccident(Accident accident) {
		
		return accidentRepository.findById(accident.getAccidentid()).map(oldAccident->{
			oldAccident.setAdditionalInfo(accident.getAdditionalInfo());
			oldAccident.setAccidentType(accident.getAccidentType());
			oldAccident.setAddressLocation(accident.getAddressLocation());
			oldAccident.setAttachments(accident.getAttachments());
			oldAccident.setCity(accident.getCity());
			oldAccident.setDateCreated(accident.getDateCreated());
			oldAccident.setDateOfAccident(accident.getDateOfAccident());
			oldAccident.setDateUpdated(accident.getDateUpdated());
			oldAccident.setLatitude(accident.getLatitude());
			oldAccident.setLegalRoadSpeedKmh(accident.getLegalRoadSpeedKmh());
			oldAccident.setLogitude(accident.getLogitude());
			oldAccident.setNumberOfDeath(accident.getNumberOfDeath());
			oldAccident.setNumberOfMajorInjury(accident.getNumberOfMajorInjury());
			oldAccident.setNumberOfMinorInjury(accident.getNumberOfMinorInjury());
			oldAccident.setNumberOfModerateInjury(accident.getNumberOfModerateInjury());
			oldAccident.setNumberOfPeopleInvolved(accident.getNumberOfPeopleInvolved());
			oldAccident.setNumberOfVehiclesInvolved(accident.getNumberOfVehiclesInvolved());
			oldAccident.setRegion(accident.getRegion());
			oldAccident.setReportingOfficerName(accident.getReportingOfficerName());
			oldAccident.setReportingOfficerPhone(accident.getReportingOfficerPhone());
			oldAccident.setReportingOfficerStataion(accident.getReportingOfficerStataion());
			oldAccident.setRoadClassification(accident.getRoadClassification());
			oldAccident.setRoadCondition(accident.getRoadCondition());
			oldAccident.setRoadType(accident.getRoadType());
			oldAccident.setTimeOfAccident(accident.getTimeOfAccident());
			oldAccident.setUknownInjury(accident.getUknownInjury());
			oldAccident.setUpdatedBy(accident.getUpdatedBy());
			oldAccident.setVehicles(accident.getVehicles());
			oldAccident.setWeatherDuringAccident(accident.getWeatherDuringAccident());
			return accidentRepository.save(oldAccident);
		}).orElseThrow(null);
				
			

			
		
	}

	@Override
	public Accident saveAccident(Accident accident) {
		return accidentRepository.save(accident);
	}

}
