package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trafficaccidentsanalysis.backend.model.Employeecontact;

public interface EmployeeContactRepository extends JpaRepository<Employeecontact, Integer> {

}
