package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the employeerole database table.
 * 
 */
@Entity
@NamedQuery(name="Employeerole.findAll", query="SELECT e FROM Employeerole e")
public class Employeerole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_roleid")
	private int employeeRoleid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="updated_by")
	private String updatedBy;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employeeid")
	private Employee employee;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="roleid")
	private Role role;

	public Employeerole() {
	}

	
	
	private Employeerole(Date dateCreated, Date dateUpdated, String updatedBy, Employee employee, Role role) {
		super();
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.updatedBy = updatedBy;
		this.employee = employee;
		this.role = role;
	}



	public int getEmployeeRoleid() {
		return this.employeeRoleid;
	}

	public void setEmployeeRoleid(int employeeRoleid) {
		this.employeeRoleid = employeeRoleid;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}