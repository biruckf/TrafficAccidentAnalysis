package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the employeecontact database table.
 * 
 */
@Entity
@NamedQuery(name="Employeecontact.findAll", query="SELECT e FROM Employeecontact e")
public class Employeecontact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_contactid")
	private int employeeContactid;

	@Column(name="address_location")
	private String addressLocation;

	private String city;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	private String department;

	private String email;

	@Column(name="email_confirmed")
	private byte emailConfirmed;

	@Column(name="phone_number_mobile")
	private String phoneNumberMobile;

	@Column(name="phone_number_office")
	private String phoneNumberOffice;

	@Column(name="phone_number2")
	private String phoneNumber2;

	@Column(name="phone_number2type")
	private String phoneNumber2type;

	@Column(name="phone_number3")
	private String phoneNumber3;

	@Column(name="phone_number3type")
	private String phoneNumber3type;

	private String region;

	@Column(name="tow_factor_enabled")
	private byte towFactorEnabled;

	@Column(name="updated_by")
	private String updatedBy;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employeeid")
	private Employee employee;

	public Employeecontact() {
	}

	public int getEmployeeContactid() {
		return this.employeeContactid;
	}

	public void setEmployeeContactid(int employeeContactid) {
		this.employeeContactid = employeeContactid;
	}

	public String getAddressLocation() {
		return this.addressLocation;
	}

	public void setAddressLocation(String addressLocation) {
		this.addressLocation = addressLocation;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(byte emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public String getPhoneNumberMobile() {
		return this.phoneNumberMobile;
	}

	public void setPhoneNumberMobile(String phoneNumberMobile) {
		this.phoneNumberMobile = phoneNumberMobile;
	}

	public String getPhoneNumberOffice() {
		return this.phoneNumberOffice;
	}

	public void setPhoneNumberOffice(String phoneNumberOffice) {
		this.phoneNumberOffice = phoneNumberOffice;
	}

	public String getPhoneNumber2() {
		return this.phoneNumber2;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public String getPhoneNumber2type() {
		return this.phoneNumber2type;
	}

	public void setPhoneNumber2type(String phoneNumber2type) {
		this.phoneNumber2type = phoneNumber2type;
	}

	public String getPhoneNumber3() {
		return this.phoneNumber3;
	}

	public void setPhoneNumber3(String phoneNumber3) {
		this.phoneNumber3 = phoneNumber3;
	}

	public String getPhoneNumber3type() {
		return this.phoneNumber3type;
	}

	public void setPhoneNumber3type(String phoneNumber3type) {
		this.phoneNumber3type = phoneNumber3type;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public byte getTowFactorEnabled() {
		return this.towFactorEnabled;
	}

	public void setTowFactorEnabled(byte towFactorEnabled) {
		this.towFactorEnabled = towFactorEnabled;
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