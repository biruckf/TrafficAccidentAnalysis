package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trafficaccidentsanalysis.backend.model.Motorist;


public interface MotoristRepository extends JpaRepository<Motorist, Long> {
}
