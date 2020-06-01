package com.trafficaccidentsanalysis.backend.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.VehicleRepository;
@Service
public  class VehicleServiceImpl implements VehicleService {

	
	@Autowired
	VehicleRepository vehicleRepository ;

	
	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

/*	I am tying to add this section for adding new vehicle. let me know.
    @Override
	public Vehicle addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepository.add(vehicle);
	}   */
	
	@Override
	public ResponseEntity<?> deleteVehicle(Vehicle vehicle) {
		return (ResponseEntity<?>) vehicleRepository.findById(vehicle.getVehicleid()).map(vehicleDelete->{
			vehicleRepository.delete(vehicleDelete);
		return ResponseEntity.ok();
		}).orElseThrow(null);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepository.findById(vehicle.getVehicleid()).map(oldVehicle->{
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
public Set<Vehicle> findByAccident(int id) {
		
		Set <Vehicle> vehiclelist = new HashSet<Vehicle>();
		
		Optional<Iterable<Vehicle>> vehicle = Optional.of(this.vehicleRepository.findAll());
		if (vehicle.isPresent()) { // do we really need this?
		    
			
			//vehicle.get().forEach(item -> {
		     Iterable<Vehicle> v = vehicle.get();
		     v.forEach(veh->{
		    	if(veh.getAccident() != null) {
		    		if(veh.getAccident().getAccidentid() == id){
		    			vehiclelist.add(veh);
		    			
		    		}
		    		
		    	}
		    	 
		     });
		
		    	 //System.out.println(item.);
		    	///if(item.getAccident() == null) {
		    		
		    		
		    		//Accident a = item.getAccident();
		    		//if(item.getAccident().getAccidentid() == id) {
		    			// vehiclelist.add(item);
		    		// }
		    		
		    	//}
		    	
		    	 
		    	  //});
		
		    
		    } else {
		    // the result is empty
		}
		
		return vehiclelist;
	}

	@Override
	public Iterable<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return this.vehicleRepository.findAll();
	}


}

	


