package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Role;

@Service
public interface RoleService {
	 Role addRole(Role role);
	 List<Role>findAllRole();
	 Optional<Role> findById(int roleId);
	 Optional<Role> findByName(String roleName);

}