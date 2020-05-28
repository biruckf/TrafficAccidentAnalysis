package com.trafficaccidentsanalysis.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.dto.MakeDto;
import com.trafficaccidentsanalysis.backend.dto.ModelDto;
import com.trafficaccidentsanalysis.backend.dto.VehicleDto;
import com.trafficaccidentsanalysis.backend.dto.YearDto;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getAllVehicle() {
		return (List<Vehicle>) vehicleRepository.findAll();
	}

	@Override
	public Vehicle saveVehicle(VehicleDto vehicle) {
		Vehicle v = new Vehicle();
		  v.setModel(vehicle.getModelDto());
		  v.setMake(vehicle.getMakeDto());
		  v.setYear(vehicle.getYearDto());
		return vehicleRepository.save(v);
	}

	/*
	 * I am tying to add this section for adding new vehicle. let me know.
	 * 
	 * @Override public Vehicle addVehicle(Vehicle vehicle) { // TODO Auto-generated
	 * method stub return vehicleRepository.add(vehicle); }
	 */

	@Override
	public ResponseEntity<?> deleteVehicle(Vehicle vehicle) {
		return (ResponseEntity<?>) vehicleRepository.findById(vehicle.getVehicleid()).map(vehicleDelete -> {
			vehicleRepository.delete(vehicleDelete);
			
			return ResponseEntity.ok();
		}).orElseThrow(null);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepository.findById(vehicle.getVehicleid()).map(oldVehicle -> {
			oldVehicle.setAccident(vehicle.getAccident());
			oldVehicle.setColor(vehicle.getColor());
			oldVehicle.setMake(vehicle.getMake());
			oldVehicle.setModel(vehicle.getModel());
			oldVehicle.setPlateNumber(vehicle.getPlateNumber());
			oldVehicle.setVehicle_speed_before_accident_KMh(vehicle.getVehicle_speed_before_accident_KMh());
			oldVehicle.setVehicleOwner(vehicle.getVehicleOwner());
			oldVehicle.setVehicleType(vehicle.getVehicleType());
			oldVehicle.setVin(vehicle.getVin());
			oldVehicle.setYear(vehicle.getYear());
			oldVehicle.setAdditionalInfo(vehicle.getAdditionalInfo());
			oldVehicle.setDamageClass(vehicle.getDamageClass());
			oldVehicle.setAccidentPosition(vehicle.getAccidentPosition());
			oldVehicle.setHasInsurance(vehicle.getHasInsurance());
			oldVehicle.setMannerOfCollision(vehicle.getMannerOfCollision());
			oldVehicle.setPersoninvehicles(vehicle.getPersoninvehicles());
			oldVehicle.setDateUpdated(vehicle.getDateUpdated());
			return vehicleRepository.save(oldVehicle);
		}).orElseThrow(null);

	}

	@Override
	public Vehicle findVehicleById(int vehicleId) {
		return vehicleRepository.findById(vehicleId).orElse(null);
	}

	@Override
	public List<Vehicle> findByModel(ModelDto modelDto) {
		return this.vehicleRepository.findByModel(modelDto.getModelDto());
	}

	@Override
	public List<Vehicle> findByYear(YearDto yearDto) {
		return this.vehicleRepository.findByYear(yearDto.getYearDto());
	}

	@Override
	public List<Vehicle> findByMake(MakeDto makeDto) {
		return this.vehicleRepository.findByMake(makeDto.getMakeDto());
	}

}
