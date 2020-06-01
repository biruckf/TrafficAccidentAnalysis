package com.trafficaccidentsanalysis.backend.dto;

import java.util.List;

public class AccidentDto2 {
	
	private List<Object> personsinVehicle;
	private List<Object> motoristDto;
	private List<Object> pedistriansDto;
	

	public List<Object> getMotoristDto() {
		return motoristDto;
	}

	public List<Object> getPedistriansDto() {
		return pedistriansDto;
	}

	public List<Object> getPersonsinVehicle() {
		return personsinVehicle;
	}

	

}
