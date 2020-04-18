package com.trafficaccidentsanalysis.backend;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trafficaccidentsanalysis.backend.dto.AccidentDto;
import com.trafficaccidentsanalysis.backend.model.Accident;
import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.model.Personinvehicle;
import com.trafficaccidentsanalysis.backend.model.Vehicle;
import com.trafficaccidentsanalysis.backend.repository.AccidentRepository;
import com.trafficaccidentsanalysis.backend.service.AccidentService;

@SpringBootApplication
public class TrafficaccidentsanalysisApplication implements CommandLineRunner{
@Autowired
AccidentService accidentService;
	public static void main(String[] args) {
		SpringApplication.run(TrafficaccidentsanalysisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Accident accident=new Accident();
//		Set<Vehicle> vehicles=new HashSet<Vehicle>();
//		
//		Vehicle vehicle =new Vehicle();
//		Vehicle vehicle2 =new Vehicle();
//		
//		Personinvehicle person=new Personinvehicle();
//		Motorist m=new Motorist();
//		
//		m.setAdditionalInfo("Moterist");;
//		accident.setAccidentType("Test3");
//		person.setAdditionalInfo("Testing");
//		
//		vehicle.setModel("Toyota");
//		vehicle.addPersoninvehicle(person);
//		vehicle.addMotorist(m);
//		vehicle2.setModel("Nissan");
//		
//		
//		
//		vehicles.add(vehicle);
//		
//		vehicles.add(vehicle2);
//		
////		accident.addVehicle(vehicle);
////		accident.addVehicle(vehicle2);
//		accident.setVehicles(vehicles);
//		accidentService.saveAccident(accident);
//		
		
	}

}
