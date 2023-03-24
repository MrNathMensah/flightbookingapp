package com.ghana.airways.flightbooking.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Baggage {
	
	@Id
	@GeneratedValue
	private Long id;
	private Double weightInKg;
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name="booking_id")
	private Booking booking;

	public Baggage() {
		super();
	}

	public Baggage(Long id, Double weightInKg, Date createdAt, Date updatedAt, Booking booking) {
		super();
		this.id = id;
		this.weightInKg = weightInKg;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.booking = booking;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(Double weightInKg) {
		this.weightInKg = weightInKg;
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
	
	

}
