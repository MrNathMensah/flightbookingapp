package com.ghana.airways.flightbooking.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airport {
	
	@Id
	@GeneratedValue
	private Long id;
	private String airportName;
	private String country;
	private String state;
	private String city;
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(mappedBy="airportDepart")
	private List<Flights> flights;
	
	@OneToMany(mappedBy="airportArrive")
	private List<Flights> flight;

	public Airport() {
		super();
	}

	public Airport(Long id, String airportName, String country, String state, String city, Date createdAt,
			Date updatedAt, List<Flights> flights, List<Flights> flight) {
		super();
		this.id = id;
		this.airportName = airportName;
		this.country = country;
		this.state = state;
		this.city = city;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.flights = flights;
		this.flight = flight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public List<Flights> getFlights() {
		return flights;
	}

	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}

	public List<Flights> getFlight() {
		return flight;
	}

	public void setFlight(List<Flights> flight) {
		this.flight = flight;
	}
	
	

}
