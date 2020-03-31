package com.trafficaccidentsanalysis.backend.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the roadtype database table.
 * 
 */
@Entity
@NamedQuery(name="Roadtype.findAll", query="SELECT r FROM Roadtype r")
public class Roadtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="road_typeid")
	private int roadTypeid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;

	@Column(name="road_type")
	private String roadType;

	@Column(name="updated_by")
	private String updatedBy;

	public Roadtype() {
	}
	
	
	public Roadtype(Date dateCreated, Date dateUpdated, String roadType, String updatedBy) {
		super();
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.roadType = roadType;
		this.updatedBy = updatedBy;
	}
	


	public int getRoadTypeid() {
		return this.roadTypeid;
	}

	public void setRoadTypeid(int roadTypeid) {
		this.roadTypeid = roadTypeid;
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

	public String getRoadType() {
		return this.roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}