package com.ghana.airways.flightbooking.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BaggageCheck {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String checkResults;
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name="booking_Id")
	private Booking booking;
	
	@OneToOne
	@JoinColumn(name="passenger_id")
	private Passenger passenger;

	public BaggageCheck() {
		super();
	}

	public BaggageCheck(Long id, String checkResults, Date createdAt, Date updatedAt, Booking booking,
			Passenger passenger) {
		super();
		this.id = id;
		this.checkResults = checkResults;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.booking = booking;
		this.passenger = passenger;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCheckResults() {
		return checkResults;
	}

	public void setCheckResults(String checkResults) {
		this.checkResults = checkResults;
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

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
	

}
