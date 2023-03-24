package com.ghana.airways.flightbooking.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class NoFlyList {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date activeFrom;
	private Date activeTo;
	private String noFlyReason;
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name="passenger_id")
	private Passenger passenger;

	public NoFlyList() {
		super();
	}

	public NoFlyList(Long id, Date activeFrom, Date activeTo, String noFlyReason, Date createdAt, Date updatedAt,
			Passenger passenger) {
		super();
		this.id = id;
		this.activeFrom = activeFrom;
		this.activeTo = activeTo;
		this.noFlyReason = noFlyReason;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.passenger = passenger;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getActiveFrom() {
		return activeFrom;
	}

	public void setActiveFrom(Date activeFrom) {
		this.activeFrom = activeFrom;
	}

	public Date getActiveTo() {
		return activeTo;
	}

	public void setActiveTo(Date activeTo) {
		this.activeTo = activeTo;
	}

	public String getNoFlyReason() {
		return noFlyReason;
	}

	public void setNoFlyReason(String noFlyReason) {
		this.noFlyReason = noFlyReason;
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

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
	
	

}
