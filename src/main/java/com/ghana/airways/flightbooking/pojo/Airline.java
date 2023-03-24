package com.ghana.airways.flightbooking.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airline {
	
	@Id
	@GeneratedValue
	private Long id;
	private String airlineCode;
	private String airlineName;
	private String arilineCountry;
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(mappedBy="airline")
	private List<Flights> flights;

	public Airline() {
		super();
	}

	public Airline(Long id, String airlineCode, String airlineName, String arilineCountry, Date createdAt,
			Date updatedAt, List<Flights> flights) {
		super();
		this.id = id;
		this.airlineCode = airlineCode;
		this.airlineName = airlineName;
		this.arilineCountry = arilineCountry;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.flights = flights;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getArilineCountry() {
		return arilineCountry;
	}

	public void setArilineCountry(String arilineCountry) {
		this.arilineCountry = arilineCountry;
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
	
	

}
