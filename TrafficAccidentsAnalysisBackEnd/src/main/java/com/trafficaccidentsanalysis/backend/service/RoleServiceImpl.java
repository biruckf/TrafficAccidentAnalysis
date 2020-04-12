package com.trafficaccidentsanalysis.backend.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trafficaccidentsanalysis.backend.model.Role;
import com.trafficaccidentsanalysis.backend.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository roleRepository;

	@Override
    public Role saveRole(Role role) {	
		
		return roleRepository.save(role);
	}


	@Override
    public List<Role> getAllRoles() {
		
		return roleRepository.findAll();
	}


	@Override
	public Role updateRole(Role role) {
		return roleRepository.findById(role.getRoleid()).map(oldRole -> {
			oldRole.setDateUpdated(new Date());
			oldRole.setEmployeeroles(role.getEmployeeroles());
			oldRole.setRoleName(role.getRoleName());
			oldRole.setUpdatedBy(role.getUpdatedBy());		
		return roleRepository.save(oldRole);
		}).orElseThrow(null);
	}

	@Override
	public ResponseEntity<?> deleteRole(int roleid) {
	roleRepository.findById(roleid); 
	return ResponseEntity.ok("Successfully Deleted!");
	
  }


}
