package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the motorist database table.
 * 
 */
@Entity
@NamedQuery(name="Motorist.findAll", query="SELECT m FROM Motorist m")
public class Motorist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int motoristid;

	@Column(name="additional_info")
	private String additionalInfo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	private String education;

	@Column(name="has_license")
	private byte hasLicense;

	@Column(name="issued_country")
	private String issuedCountry;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="issued_date")
	private Date issuedDate;

	@Column(name="issued_state")
	private String issuedState;

	@Column(name="license_number")
	private String licenseNumber;

	@Column(name="motoris_readiness")
	private String motorisReadiness;

	//bi-directional many-to-one association to Vehicle
	@ManyToOne
	@JoinColumn(name="vehicleid")
	private Vehicle vehicle;

	public Motorist() {
	}
	public int getMotoristid() {
		return this.motoristid;
	}

	public void setMotoristid(int motoristid) {
		this.motoristid = motoristid;
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

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public byte getHasLicense() {
		return this.hasLicense;
	}

	public void setHasLicense(byte hasLicense) {
		this.hasLicense = hasLicense;
	}

	public String getIssuedCountry() {
		return this.issuedCountry;
	}

	public void setIssuedCountry(String issuedCountry) {
		this.issuedCountry = issuedCountry;
	}

	public Date getIssuedDate() {
		return this.issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getIssuedState() {
		return this.issuedState;
	}

	public void setIssuedState(String issuedState) {
		this.issuedState = issuedState;
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getMotorisReadiness() {
		return this.motorisReadiness;
	}

	public void setMotorisReadiness(String motorisReadiness) {
		this.motorisReadiness = motorisReadiness;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}