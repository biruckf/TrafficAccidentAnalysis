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

	private int employeeid;

	private int roleid;

	@Column(name="updated_by")
	private String updatedBy;

	public Employeerole() {
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

	public int getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getRoleid() {
		return this.roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}