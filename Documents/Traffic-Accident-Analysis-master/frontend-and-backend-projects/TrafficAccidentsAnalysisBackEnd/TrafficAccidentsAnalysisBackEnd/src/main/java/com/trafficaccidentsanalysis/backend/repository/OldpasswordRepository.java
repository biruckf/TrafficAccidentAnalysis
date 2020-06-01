package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Oldpassword;

@Repository
public interface OldpasswordRepository  extends JpaRepository<Oldpassword, Integer>{

}
