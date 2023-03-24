package com.ghana.airways.flightbooking.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Passenger {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	private String lastName;
	private Date dob;
	private String countryOfCitizenship;
	private String countryOfResidence;
	private String passportNumber;
	private Date createdAt;
	private Date updatedAt;
	
	@OneToMany(mappedBy="passenger")
	private List<Booking> booking;
	
	@OneToOne(mappedBy="passenger")
	private BaggageCheck baggageCheck;
	
	@OneToMany(mappedBy="passenger")
	private List<NoFlyList> noFly;
	
	@OneToMany(mappedBy="passenger")
	private List<SecurityCheck> securityCheck;

	public Passenger() {
		super();
	}

	public Passenger(Long id, String firstName, String lastName, Date dob, String countryOfCitizenship,
			String countryOfResidence, String passportNumber, Date createdAt, Date updatedAt, List<Booking> booking,
			BaggageCheck baggageCheck, List<NoFlyList> noFly, List<SecurityCheck> securityCheck) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.countryOfCitizenship = countryOfCitizenship;
		this.countryOfResidence = countryOfResidence;
		this.passportNumber = passportNumber;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.booking = booking;
		this.baggageCheck = baggageCheck;
		this.noFly = noFly;
		this.securityCheck = securityCheck;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCountryOfCitizenship() {
		return countryOfCitizenship;
	}

	public void setCountryOfCitizenship(String countryOfCitizenship) {
		this.countryOfCitizenship = countryOfCitizenship;
	}

	public String getCountryOfResidence() {
		return countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
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

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}

	public BaggageCheck getBaggageCheck() {
		return baggageCheck;
	}

	public void setBaggageCheck(BaggageCheck baggageCheck) {
		this.baggageCheck = baggageCheck;
	}

	public List<NoFlyList> getNoFly() {
		return noFly;
	}

	public void setNoFly(List<NoFlyList> noFly) {
		this.noFly = noFly;
	}

	public List<SecurityCheck> getSecurityCheck() {
		return securityCheck;
	}

	public void setSecurityCheck(List<SecurityCheck> securityCheck) {
		this.securityCheck = securityCheck;
	}

	

}
