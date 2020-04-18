package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pedastrian database table.
 * 
 */
@Entity
@NamedQuery(name="Pedastrian.findAll", query="SELECT p FROM Pedastrian p")
public class Pedastrian implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pedastrianid;

	@Column(name="additional_info")
	private String additionalInfo;

	private String address;

	private int age;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Column(name="first_name")
	private String firstName;

	@Column(name="injury_class")
	private String injuryClass;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="phone_number")
	private String phoneNumber;

	@Column(name="position_during_accident")
	private String positionDuringAccident;

	private String sex;

	//bi-directional many-to-one association to Vehicle
	@ManyToOne
	@JoinColumn(name="vehicleid")
	private Vehicle vehicle;

	public Pedastrian() {
	}

	public int getPedastrianid() {
		return this.pedastrianid;
	}

	public void setPedastrianid(int pedastrianid) {
		this.pedastrianid = pedastrianid;
	}

	public String getAdditionalInfo() {
		return this.additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getInjuryClass() {
		return this.injuryClass;
	}

	public void setInjuryClass(String injuryClass) {
		this.injuryClass = injuryClass;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPositionDuringAccident() {
		return this.positionDuringAccident;
	}

	public void setPositionDuringAccident(String positionDuringAccident) {
		this.positionDuringAccident = positionDuringAccident;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}