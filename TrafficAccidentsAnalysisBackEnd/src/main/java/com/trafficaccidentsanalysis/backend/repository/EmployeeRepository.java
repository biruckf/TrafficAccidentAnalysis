package com.trafficaccidentsanalysis.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
