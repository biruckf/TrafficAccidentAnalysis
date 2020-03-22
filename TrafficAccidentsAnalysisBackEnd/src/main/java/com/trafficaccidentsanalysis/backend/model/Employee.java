package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="access_lockout_end")
	private Date accessLockoutEnd;

	@Column(name="additional_info")
	private String additionalInfo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="first_name")
	private String firstName;

	@Column(name="is_active")
	private Boolean isActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_accessed_date")
	private Date lastAccessedDate;

	@Column(name="last_name")
	private String lastName;

	@Column(name="login_failed_count")
	private short loginFailedCount;

	@Column(name="login_lockout_enabled")
	private Boolean loginLockoutEnabled;

	private String password;

	@Column(name="password_hash")
	private String passwordHash;

	@Column(name="password_salt")
	private String passwordSalt;

	@Column(name="updated_by")
	private String updatedBy;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-one association to Employeecontact
	@OneToMany(mappedBy="employee")
	private List<Employeecontact> employeecontacts;

	//bi-directional many-to-one association to Employeerole
	@OneToMany(mappedBy="employee")
	private List<Employeerole> employeeroles;

	//bi-directional many-to-one association to Oldpassword
	@OneToMany(mappedBy="employee")
	private List<Oldpassword> oldpasswords;

	public Employee() {
	}

	public int getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public Date getAccessLockoutEnd() {
		return this.accessLockoutEnd;
	}

	public void setAccessLockoutEnd(Date accessLockoutEnd) {
		this.accessLockoutEnd = accessLockoutEnd;
	}

	public String getAdditionalInfo() {
		return this.additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Date getLastAccessedDate() {
		return this.lastAccessedDate;
	}

	public void setLastAccessedDate(Date lastAccessedDate) {
		this.lastAccessedDate = lastAccessedDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public short getLoginFailedCount() {
		return this.loginFailedCount;
	}

	public void setLoginFailedCount(short loginFailedCount) {
		this.loginFailedCount = loginFailedCount;
	}

	public Boolean getLoginLockoutEnabled() {
		return this.loginLockoutEnabled;
	}

	public void setLoginLockoutEnabled(Boolean loginLockoutEnabled) {
		this.loginLockoutEnabled = loginLockoutEnabled;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPasswordSalt() {
		return this.passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Employeecontact> getEmployeecontacts() {
		return this.employeecontacts;
	}

	public void setEmployeecontacts(List<Employeecontact> employeecontacts) {
		this.employeecontacts = employeecontacts;
	}

	public Employeecontact addEmployeecontact(Employeecontact employeecontact) {
		getEmployeecontacts().add(employeecontact);
		employeecontact.setEmployee(this);

		return employeecontact;
	}

	public Employeecontact removeEmployeecontact(Employeecontact employeecontact) {
		getEmployeecontacts().remove(employeecontact);
		employeecontact.setEmployee(null);

		return employeecontact;
	}

	public List<Employeerole> getEmployeeroles() {
		return this.employeeroles;
	}

	public void setEmployeeroles(List<Employeerole> employeeroles) {
		this.employeeroles = employeeroles;
	}

	public Employeerole addEmployeerole(Employeerole employeerole) {
		getEmployeeroles().add(employeerole);
		employeerole.setEmployee(this);

		return employeerole;
	}

	public Employeerole removeEmployeerole(Employeerole employeerole) {
		getEmployeeroles().remove(employeerole);
		employeerole.setEmployee(null);

		return employeerole;
	}

	public List<Oldpassword> getOldpasswords() {
		return this.oldpasswords;
	}

	public void setOldpasswords(List<Oldpassword> oldpasswords) {
		this.oldpasswords = oldpasswords;
	}

	public Oldpassword addOldpassword(Oldpassword oldpassword) {
		getOldpasswords().add(oldpassword);
		oldpassword.setEmployee(this);

		return oldpassword;
	}

	public Oldpassword removeOldpassword(Oldpassword oldpassword) {
		getOldpasswords().remove(oldpassword);
		oldpassword.setEmployee(null);

		return oldpassword;
	}

}