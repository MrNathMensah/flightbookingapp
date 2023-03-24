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
public class Booking {
	
	@Id
	@GeneratedValue
	private Long bookingId;
	
	private Long flightId;
	private String status;
	private String bookingPlatform;
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(mappedBy="booking")
	private List<BaggageCheck> baggage;
	
	@ManyToOne
	@JoinColumn(name="passenger_id")
	private Passenger passenger;
	
	@OneToMany(mappedBy="booking")
	private List<Baggage> baggage2;
	
	@OneToMany(mappedBy="booking")
	private List<BoardingPass> boardingPass;
	
	@OneToMany(mappedBy="booking")
	private List<FlightManifest> flightManifest;

	public Booking() {
		super();
	}

	public Booking(Long bookingId, Long flightId, String status, String bookingPlatform, Date createdAt, Date updatedAt,
			List<BaggageCheck> baggage, Passenger passenger, List<Baggage> baggage2, List<BoardingPass> boardingPass,
			List<FlightManifest> flightManifest) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.status = status;
		this.bookingPlatform = bookingPlatform;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.baggage = baggage;
		this.passenger = passenger;
		this.baggage2 = baggage2;
		this.boardingPass = boardingPass;
		this.flightManifest = flightManifest;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBookingPlatform() {
		return bookingPlatform;
	}

	public void setBookingPlatform(String bookingPlatform) {
		this.bookingPlatform = bookingPlatform;
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

	public List<BaggageCheck> getBaggage() {
		return baggage;
	}

	public void setBaggage(List<BaggageCheck> baggage) {
		this.baggage = baggage;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public List<Baggage> getBaggage2() {
		return baggage2;
	}

	public void setBaggage2(List<Baggage> baggage2) {
		this.baggage2 = baggage2;
	}

	public List<BoardingPass> getBoardingPass() {
		return boardingPass;
	}

	public void setBoardingPass(List<BoardingPass> boardingPass) {
		this.boardingPass = boardingPass;
	}

	public List<FlightManifest> getFlightManifest() {
		return flightManifest;
	}

	public void setFlightManifest(List<FlightManifest> flightManifest) {
		this.flightManifest = flightManifest;
	}

	

}
