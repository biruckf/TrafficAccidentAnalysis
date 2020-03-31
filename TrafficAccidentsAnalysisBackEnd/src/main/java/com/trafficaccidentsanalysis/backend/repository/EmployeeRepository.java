package com.trafficaccidentsanalysis.backend.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
=======
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trafficaccidentsanalysis.backend.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
>>>>>>> refs/remotes/origin/master

}
