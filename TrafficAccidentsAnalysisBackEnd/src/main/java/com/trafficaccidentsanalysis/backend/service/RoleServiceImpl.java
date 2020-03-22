package com.trafficaccidentsanalysis.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Role;
import com.trafficaccidentsanalysis.backend.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
@Autowired
	RoleRepository roleRepository;
	

	@Override
	public Role addRole(Role role) {
		
		return roleRepository.save(role);
	}


	@Override
	public Optional<Role> findByName(String roleName) {

		return roleRepository.findByRoleName(roleName);
	}

	@Override
	public List<Role> findAllRole() {
		
		return roleRepository.findAll();
	}


	@Override
	public Optional<Role> findById(int roleId) {
		
		return roleRepository.findById(roleId);
	}


}