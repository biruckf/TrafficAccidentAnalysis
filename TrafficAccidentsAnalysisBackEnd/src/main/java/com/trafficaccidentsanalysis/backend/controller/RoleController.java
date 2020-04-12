package com.trafficaccidentsanalysis.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trafficaccidentsanalysis.backend.model.Role;
import com.trafficaccidentsanalysis.backend.service.RoleService;

@RestController
@RequestMapping("/trafficaccidentanalysis/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/save")
	public Role saveRole(@RequestBody Role role) {
	return roleService.saveRole(role);
}
	@GetMapping("/getall")
	public List<Role> getAllRole(){
		return roleService.getAllRoles();
	}
	
	@PutMapping("/update")
	public Role updateRole(@RequestBody Role role) {
		return roleService.updateRole(role);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteRole(@PathVariable(value="id") int roleid){
		return roleService.deleteRole(roleid);
				
				
	}
}
