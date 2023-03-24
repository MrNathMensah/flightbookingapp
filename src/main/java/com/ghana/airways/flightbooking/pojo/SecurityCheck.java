package com.ghana.airways.flightbooking.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SecurityCheck {
	
	@Id
	@GeneratedValue
	private Long id;
	private String checkResult;
	private String comments;
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne
	@JoinColumn(name="passenger_id")
	private Passenger passenger;

	public SecurityCheck() {
		super();
	}

	public SecurityCheck(Long id, String checkResult, String comments, Date createdAt, Date updatedAt,
			Passenger passenger) {
		super();
		this.id = id;
		this.checkResult = checkResult;
		this.comments = comments;
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

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
