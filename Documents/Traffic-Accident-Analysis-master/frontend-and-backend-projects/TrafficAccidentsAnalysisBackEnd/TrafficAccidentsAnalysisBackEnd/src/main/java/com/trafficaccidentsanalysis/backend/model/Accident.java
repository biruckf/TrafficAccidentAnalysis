package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the accident database table.
 * 
 */
@Entity
@NamedQuery(name="Accident.findAll", query="SELECT a FROM Accident a")

public class Accident implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ACCIDENT_ID")
	private int accidentid;

	
	private String accidentType;

	
	private String additionalInfo;

	
	private String addressLocation;

	private String city;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Column(name="date_of_accident")
	private String dateOfAccident;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	private String latitude;

	@Column(name="legal_road_speed_kmh")
	private String legalRoadSpeedKmh;

	private String logitude;

	@Column(name="number_of__moderate_injury")
	private int numberOfModerateInjury;

	@Column(name="number_of_death")
	private int numberOfDeath;

	@Column(name="number_of_major_injury")
	private int numberOfMajorInjury;

	@Column(name="number_of_minor_injury")
	private int numberOfMinorInjury;

	@Column(name="number_of_people_involved")
	private int numberOfPeopleInvolved;

	@Column(name="number_of_vehicles_involved")
	private int numberOfVehiclesInvolved;

	private String region;

	@Column(name="reporting_officer_name")
	private String reportingOfficerName;

	@Column(name="reporting_officer_phone")
	private String reportingOfficerPhone;

	@Column(name="reporting_officer_stataion")
	private String reportingOfficerStataion;

	@Column(name="road_classification")
	private String roadClassification;

	@Column(name="road_condition")
	private String roadCondition;

	@Column(name="road_type")
	private String roadType;

	@Column(name="time_of_accident")
	private String timeOfAccident;

	@Column(name="uknown_injury")
	private int uknownInjury;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_by")
	private Date updatedBy;

	@Column(name="weather_during_accident")
	private String weatherDuringAccident;

	//bi-directional many-to-one association to Attachment
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "accident")
	@JsonIgnore
	private Set<Attachment> attachments;

	//bi-directional many-to-one association to Vehicle
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "accident")
	@JsonIgnore
	private Set<Vehicle> vehicles;
	
	

	public Accident() {
	}

	
	public int getAccidentid() {
		return this.accidentid;
	}

	public void setAccidentid(int accidentid) {
		this.accidentid = accidentid;
	}

	public String getAccidentType() {
		return this.accidentType;
	}

	public void setAccidentType(String accidentType) {
		this.accidentType = accidentType;
	}

	public String getAdditionalInfo() {
		return this.additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
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

	public String getDateOfAccident() {
		return this.dateOfAccident;
	}

	public void setDateOfAccident(String dateOfAccident) {
		this.dateOfAccident = dateOfAccident;
	}

	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLegalRoadSpeedKmh() {
		return this.legalRoadSpeedKmh;
	}

	public void setLegalRoadSpeedKmh(String legalRoadSpeedKmh) {
		this.legalRoadSpeedKmh = legalRoadSpeedKmh;
	}

	public String getLogitude() {
		return this.logitude;
	}

	public void setLogitude(String logitude) {
		this.logitude = logitude;
	}

	public int getNumberOfModerateInjury() {
		return this.numberOfModerateInjury;
	}

	public void setNumberOfModerateInjury(int numberOfModerateInjury) {
		this.numberOfModerateInjury = numberOfModerateInjury;
	}

	public int getNumberOfDeath() {
		return this.numberOfDeath;
	}

	public void setNumberOfDeath(int numberOfDeath) {
		this.numberOfDeath = numberOfDeath;
	}

	public int getNumberOfMajorInjury() {
		return this.numberOfMajorInjury;
	}

	public void setNumberOfMajorInjury(int numberOfMajorInjury) {
		this.numberOfMajorInjury = numberOfMajorInjury;
	}

	public int getNumberOfMinorInjury() {
		return this.numberOfMinorInjury;
	}

	public void setNumberOfMinorInjury(int numberOfMinorInjury) {
		this.numberOfMinorInjury = numberOfMinorInjury;
	}

	public int getNumberOfPeopleInvolved() {
		return this.numberOfPeopleInvolved;
	}

	public void setNumberOfPeopleInvolved(int numberOfPeopleInvolved) {
		this.numberOfPeopleInvolved = numberOfPeopleInvolved;
	}

	public int getNumberOfVehiclesInvolved() {
		return this.numberOfVehiclesInvolved;
	}

	public void setNumberOfVehiclesInvolved(int numberOfVehiclesInvolved) {
		this.numberOfVehiclesInvolved = numberOfVehiclesInvolved;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getReportingOfficerName() {
		return this.reportingOfficerName;
	}

	public void setReportingOfficerName(String reportingOfficerName) {
		this.reportingOfficerName = reportingOfficerName;
	}

	public String getReportingOfficerPhone() {
		return this.reportingOfficerPhone;
	}

	public void setReportingOfficerPhone(String reportingOfficerPhone) {
		this.reportingOfficerPhone = reportingOfficerPhone;
	}

	public String getReportingOfficerStataion() {
		return this.reportingOfficerStataion;
	}

	public void setReportingOfficerStataion(String reportingOfficerStataion) {
		this.reportingOfficerStataion = reportingOfficerStataion;
	}

	public String getRoadClassification() {
		return this.roadClassification;
	}

	public void setRoadClassification(String roadClassification) {
		this.roadClassification = roadClassification;
	}

	public String getRoadCondition() {
		return this.roadCondition;
	}

	public void setRoadCondition(String roadCondition) {
		this.roadCondition = roadCondition;
	}

	public String getRoadType() {
		return this.roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public String getTimeOfAccident() {
		return this.timeOfAccident;
	}

	public void setTimeOfAccident(String timeOfAccident) {
		this.timeOfAccident = timeOfAccident;
	}

	public int getUknownInjury() {
		return this.uknownInjury;
	}

	public void setUknownInjury(int uknownInjury) {
		this.uknownInjury = uknownInjury;
	}

	public Date getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getWeatherDuringAccident() {
		return this.weatherDuringAccident;
	}

	public void setWeatherDuringAccident(String weatherDuringAccident) {
		this.weatherDuringAccident = weatherDuringAccident;
	}

	public Set<Attachment> getAttachments() {
		if(this.attachments == null) {
			this.attachments= new HashSet<Attachment>();
		}
		return this.attachments;
	}

	public void setAttachments(Set<Attachment> attachments) {
		if(this.attachments == null) {
			this.attachments= new HashSet<Attachment>();
		}
		for(Attachment a:attachments) {
			getAttachments().add(a);
			a.setAccident(this);
		}
		
		this.attachments = attachments;
	}

	public Attachment addAttachment(Attachment attachment) {
		if(this.attachments == null) {
			this.attachments= new HashSet<Attachment>();
		}
		getAttachments().add(attachment);
		attachment.setAccident(this);

		return attachment;
	}

	public Attachment removeAttachment(Attachment attachment) {
		getAttachments().remove(attachment);
		attachment.setAccident(null);

		return attachment;
	}

	public Set<Vehicle> getVehicles() {
		if(vehicles == null) {
			vehicles= new HashSet<Vehicle>();
		}
		return this.vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		if(this.vehicles == null) {
			this.vehicles= new HashSet<Vehicle>();
		}
		for(Vehicle v:vehicles) {
			getVehicles().add(v);
			v.setAccident(this);
		}
		
	}

	public Vehicle addVehicle(Vehicle vehicle) {
		if(vehicles == null) {
			vehicles= new HashSet<Vehicle>();
		}
		getVehicles().add(vehicle);
		vehicle.setAccident(this);

		return vehicle;
	}

	public Vehicle removeVehicle(Vehicle vehicle) {
		getVehicles().remove(vehicle);
		vehicle.setAccident(null);

		return vehicle;
	}

	
}