package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the vehicle database table.
 * 
 */
@Entity
@NamedQuery(name="Vehicle.findAll", query="SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehicleid;

	@Column(name="accident_position")
	private String accidentPosition;

	@Column(name="additional_info")
	private String additionalInfo;

	private String color;

	@Column(name="damage_class")
	private String damageClass;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="has_insurance")
	private byte hasInsurance;

	private String make;

	@Column(name="manner_of_collision")
	private String mannerOfCollision;

	private String model;

	@Column(name="plate_number")
	private String plateNumber;

	@Column(name="vehicle_owner")
	private String vehicleOwner;

	private int vehicle_speed_before_accident_KMh;

	@Column(name="vehicle_type")
	private String vehicleType;

	private String vin;

	private int year;

	//bi-directional many-to-one association to Motorist
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "vehicle")
	@JsonIgnore
	private Set<Motorist> motorists;

	//bi-directional many-to-one association to Pedastrian
	@OneToMany(mappedBy="vehicle")
	private Set<Pedastrian> pedastrians;

	//bi-directional many-to-one association to Personinvehicle
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "vehicle")
	@JsonIgnore
	private Set<Personinvehicle> personinvehicles;

	//bi-directional many-to-one association to Accident
	@ManyToOne
	@JoinColumn(name="accidentid")
	private Accident accident;

	public Vehicle() {
	}

	public Vehicle(String accidentPosition, String additionalInfo, String color, String damageClass, Date dateCreated,
			Date dateUpdated, byte hasInsurance, String make, String mannerOfCollision, String model,
			String plateNumber, String vehicleOwner, int vehicle_speed_before_accident_KMh, String vehicleType,
			String vin, int year, Accident accident) {
		super();
		this.accidentPosition = accidentPosition;
		this.additionalInfo = additionalInfo;
		this.color = color;
		this.damageClass = damageClass;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.hasInsurance = hasInsurance;
		this.make = make;
		this.mannerOfCollision = mannerOfCollision;
		this.model = model;
		this.plateNumber = plateNumber;
		this.vehicleOwner = vehicleOwner;
		this.vehicle_speed_before_accident_KMh = vehicle_speed_before_accident_KMh;
		this.vehicleType = vehicleType;
		this.vin = vin;
		this.year = year;
		this.accident = accident;
	}

	public int getVehicleid() {
		return this.vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getAccidentPosition() {
		return this.accidentPosition;
	}

	public void setAccidentPosition(String accidentPosition) {
		this.accidentPosition = accidentPosition;
	}

	public String getAdditionalInfo() {
		return this.additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDamageClass() {
		return this.damageClass;
	}

	public void setDamageClass(String damageClass) {
		this.damageClass = damageClass;
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

	public byte getHasInsurance() {
		return this.hasInsurance;
	}

	public void setHasInsurance(byte hasInsurance) {
		this.hasInsurance = hasInsurance;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMannerOfCollision() {
		return this.mannerOfCollision;
	}

	public void setMannerOfCollision(String mannerOfCollision) {
		this.mannerOfCollision = mannerOfCollision;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getVehicleOwner() {
		return this.vehicleOwner;
	}

	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}

	public int getVehicle_speed_before_accident_KMh() {
		return this.vehicle_speed_before_accident_KMh;
	}

	public void setVehicle_speed_before_accident_KMh(int vehicle_speed_before_accident_KMh) {
		this.vehicle_speed_before_accident_KMh = vehicle_speed_before_accident_KMh;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set<Motorist> getMotorists() {
		return this.motorists;
	}

	public void setMotorists(Set<Motorist> motorists) {
		if(this.motorists==null) {
			this.motorists=new HashSet<Motorist>();
		}
		for(Motorist m:motorists) {
			getMotorists().add(m);
			m.setVehicle(this);
		}
		this.motorists = motorists;
	}

	public Motorist addMotorist(Motorist motorist) {
		if(motorists==null) {
			motorists=new HashSet<Motorist>();
		}
		getMotorists().add(motorist);
		motorist.setVehicle(this);

		return motorist;
	}

	public Motorist removeMotorist(Motorist motorist) {
		getMotorists().remove(motorist);
		motorist.setVehicle(null);

		return motorist;
	}

	public Set<Pedastrian> getPedastrians() {
		return this.pedastrians;
	}

	public void setPedastrians(Set<Pedastrian> pedastrians) {
		this.pedastrians = pedastrians;
	}

	public Pedastrian addPedastrian(Pedastrian pedastrian) {
		getPedastrians().add(pedastrian);
		pedastrian.setVehicle(this);

		return pedastrian;
	}

	public Pedastrian removePedastrian(Pedastrian pedastrian) {
		getPedastrians().remove(pedastrian);
		pedastrian.setVehicle(null);

		return pedastrian;
	}

	public Set<Personinvehicle> getPersoninvehicles() {
		return this.personinvehicles;
	}

	public void setPersoninvehicles(Set<Personinvehicle> personinvehicles) {
		if(this.personinvehicles==null) {
			this.personinvehicles=new HashSet<Personinvehicle>();
		}
		for(Personinvehicle person:personinvehicles) {
			getPersoninvehicles().add(person);
			person.setVehicle(this);
		}
		
	}

	public Personinvehicle addPersoninvehicle(Personinvehicle personinvehicle) {
		if(personinvehicles==null) {
			personinvehicles=new HashSet<Personinvehicle>();
		}
		getPersoninvehicles().add(personinvehicle);
		personinvehicle.setVehicle(this);

		return personinvehicle;
	}

	public Personinvehicle removePersoninvehicle(Personinvehicle personinvehicle) {
		getPersoninvehicles().remove(personinvehicle);
		personinvehicle.setVehicle(null);

		return personinvehicle;
	}

	public Accident getAccident() {
		return this.accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

}