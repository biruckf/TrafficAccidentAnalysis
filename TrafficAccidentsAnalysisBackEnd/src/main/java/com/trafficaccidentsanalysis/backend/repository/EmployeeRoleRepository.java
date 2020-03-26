package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Employeerole;

@Repository
public interface EmployeeRoleRepository extends JpaRepository<Employeerole , Integer> {
}
