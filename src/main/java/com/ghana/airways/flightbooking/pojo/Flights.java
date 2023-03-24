package com.ghana.airways.flightbooking.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Flights {
	
	@Id
	@GeneratedValue
	private Long id;
	private String departingDate;
	private String arrivingDate;
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name="airline_id")
	private Airline airline;
	
	@OneToMany(mappedBy="flights")
	private List<FlightManifest> flightManifest;
	
	@ManyToOne
	@JoinColumn(name="departing_airport_id")
	private Airport airportDepart;
	
	@ManyToOne
	@JoinColumn(name="arriving_airport_id")
	private Airport airportArrive;

	public Flights() {
		super();
	}

	public Flights(Long id, String departingDate, String arrivingDate, Date createdAt, Date updatedAt, Airline airline,
			List<FlightManifest> flightManifest, Airport airportDepart, Airport airportArrive) {
		super();
		this.id = id;
		this.departingDate = departingDate;
		this.arrivingDate = arrivingDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.airline = airline;
		this.flightManifest = flightManifest;
		this.airportDepart = airportDepart;
		this.airportArrive = airportArrive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartingDate() {
		return departingDate;
	}

	public void setDepartingDate(String departingDate) {
		this.departingDate = departingDate;
	}

	public String getArrivingDate() {
		return arrivingDate;
	}

	public void setArrivingDate(String arrivingDate) {
		this.arrivingDate = arrivingDate;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public List<FlightManifest> getFlightManifest() {
		return flightManifest;
	}

	public void setFlightManifest(List<FlightManifest> flightManifest) {
		this.flightManifest = flightManifest;
	}

	public Airport getAirportDepart() {
		return airportDepart;
	}

	public void setAirportDepart(Airport airportDepart) {
		this.airportDepart = airportDepart;
	}

	public Airport getAirportArrive() {
		return airportArrive;
	}

	public void setAirportArrive(Airport airportArrive) {
		this.airportArrive = airportArrive;
	}
	
	

}
