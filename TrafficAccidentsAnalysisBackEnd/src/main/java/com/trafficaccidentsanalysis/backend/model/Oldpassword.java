package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the oldpassword database table.
 * 
 */
@Entity
@NamedQuery(name="Oldpassword.findAll", query="SELECT o FROM Oldpassword o")
public class Oldpassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="old_passwordid")
	private int oldPasswordid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="old_password")
	private String oldPassword;

	@Column(name="old_password_hash")
	private String oldPasswordHash;

	@Column(name="updated_by")
	private String updatedBy;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employeeid")
	private Employee employee;

	public Oldpassword() {
	}

	public int getOldPasswordid() {
		return this.oldPasswordid;
	}

	public void setOldPasswordid(int oldPasswordid) {
		this.oldPasswordid = oldPasswordid;
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

	public String getOldPassword() {
		return this.oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getOldPasswordHash() {
		return this.oldPasswordHash;
	}

	public void setOldPasswordHash(String oldPasswordHash) {
		this.oldPasswordHash = oldPasswordHash;
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

}