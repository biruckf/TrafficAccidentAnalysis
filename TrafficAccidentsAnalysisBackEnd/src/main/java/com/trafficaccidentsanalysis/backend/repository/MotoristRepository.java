package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Motorist;

@Repository
public interface MotoristRepository extends JpaRepository<Motorist, Integer> {
}
