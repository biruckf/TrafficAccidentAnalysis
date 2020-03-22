package com.trafficaccidentsanalysis.backend.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Pedastrian;
import com.trafficaccidentsanalysis.backend.repository.PedastrianRepository;
import com.trafficaccidentsanalysis.backend.service.PedastrianService;

@Service
public class PedastrianServiceImpl implements PedastrianService {
	@Autowired
	PedastrianRepository pedastianRepository;

	@Override
	public   List<Pedastrian>  getAllPedastrian(){
		return getAllPedastrian();	
	}
	@Override	
	public   Pedastrian savePedastrian(Pedastrian pedastrian) {
		return pedastrian;
		
	}
	
	@Override	
	public void deletePedastrian(Pedastrian pedastrian) {
		
	}
	@Override
	 public  void updatePedastrian(Pedastrian pedastrian) {
		
	}
}
