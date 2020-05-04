package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dotconverter.PedastrianDtoConverter;
import com.trafficaccidentsanalysis.backend.dto.PedastrianDto;
import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.PedastrianRepository;

@Service
public class PedastrianServiceImpl implements PedastrianService {
	@Autowired
	PedastrianRepository pedastrianRepository;
	@Autowired
	VehicleService vehicleService;

	@Override
	public   List<Pedastrian>  getAllPedastrian(){
		return pedastrianRepository.findAll();	
	}
	@Override	
	public   Pedastrian savePedastrian(PedastrianDto pedastriandto, int vehicleId) {
		Vehicle vehicle=vehicleService.findVehicleById(vehicleId);
		if(vehicle!=null) {
			Pedastrian pedastrian=new PedastrianDtoConverter().pedastrianDtoToPedastrianConverter(pedastriandto);
			pedastrian.setVehicle(vehicle);
		return pedastrianRepository.save(pedastrian) ;
		}
		return null;
	}
	
	@Override	
	public ResponseEntity<?> deletePedastrian(Pedastrian pedastrian) {
		return (ResponseEntity<?>) pedastrianRepository.findById(pedastrian.getPedastrianid()).map(pedastrianToDelete->{
			pedastrianRepository.delete(pedastrianToDelete);
			return ResponseEntity.ok();
		}).orElseThrow(null);
		
	}
	@Override
	 public  Pedastrian updatePedastrian(Pedastrian pedastrian) {
		return pedastrianRepository.findById(pedastrian.getPedastrianid()).map(oldPedastrian->{
			oldPedastrian.setAdditionalInfo(pedastrian.getAdditionalInfo());
			oldPedastrian.setAddress(pedastrian.getAddress());
			oldPedastrian.setAge(pedastrian.getAge());
			oldPedastrian.setFirstName(pedastrian.getFirstName());
			oldPedastrian.setInjuryClass(pedastrian.getInjuryClass());
			oldPedastrian.setLastName(pedastrian.getLastName());
			oldPedastrian.setMiddleName(pedastrian.getMiddleName());
			oldPedastrian.setPhoneNumber(pedastrian.getPhoneNumber());
			oldPedastrian.setPositionDuringAccident(pedastrian.getPositionDuringAccident());
			oldPedastrian.setVehicle(pedastrian.getVehicle());
			oldPedastrian.setSex(pedastrian.getSex());
			return pedastrianRepository.save(oldPedastrian);
		}).orElseThrow(null);
				
			}
		
		
	}

