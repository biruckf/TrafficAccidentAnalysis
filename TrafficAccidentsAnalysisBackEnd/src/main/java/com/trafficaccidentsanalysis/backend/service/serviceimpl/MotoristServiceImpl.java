package com.trafficaccidentsanalysis.backend.service.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Motorist;
import com.trafficaccidentsanalysis.backend.repository.MotoristRepository;
import com.trafficaccidentsanalysis.backend.service.MotoristService;


	@Service
	public class MotoristServiceImpl implements MotoristService{
		@Autowired
		MotoristRepository motoristRepository;

		@Override
		public List<Motorist> getAllMotorists() {
			
			return getAllMotorists();
		}
		@Override
		public Motorist saveMotorist(Motorist motorist) {
			
			return null ;
		}

		@Override
		public void deleteMotorist(Motorist motorist) {
			
			
		}

		@Override
		public Motorist updateMotoris(Motorist motorist) {
			
			return null;
		}
	}
		
		