package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Role;

@Service
public interface RoleService {
	 
	 Role addRole(Role role);
	 
	 List<Role>getAllRoles();
     Role updateRole(Role role);
     ResponseEntity<?> deleteRole(Role role);

}