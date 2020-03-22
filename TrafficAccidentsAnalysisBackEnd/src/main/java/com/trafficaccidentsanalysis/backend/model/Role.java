package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="role_name")
	private String roleName;

	@Column(name="updated_by")
	private String updatedBy;

	//bi-directional many-to-one association to Employeerole
	@OneToMany(mappedBy="role")
	private List<Employeerole> employeeroles;

	public Role() {
	}

	public int getRoleid() {
		return this.roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<Employeerole> getEmployeeroles() {
		return this.employeeroles;
	}

	public void setEmployeeroles(List<Employeerole> employeeroles) {
		this.employeeroles = employeeroles;
	}

	public Employeerole addEmployeerole(Employeerole employeerole) {
		getEmployeeroles().add(employeerole);
		employeerole.setRole(this);

		return employeerole;
	}

	public Employeerole removeEmployeerole(Employeerole employeerole) {
		getEmployeeroles().remove(employeerole);
		employeerole.setRole(null);

		return employeerole;
	}

}