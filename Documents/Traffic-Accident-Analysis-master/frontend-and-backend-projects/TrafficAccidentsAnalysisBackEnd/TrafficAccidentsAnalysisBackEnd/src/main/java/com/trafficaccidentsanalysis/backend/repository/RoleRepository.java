package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    

  

}
