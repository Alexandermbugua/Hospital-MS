package com.Hospital.management.System.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sirName;
    private String burtisimalName; 
    private String middleName;
    private String gender;
    private String residence;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    public Patient(int id, String sirName, String burtisimalName, String middleName, String gender, String residence,
			LocalDate dateOfBirth, String phoneNumber, String nationalIdNumber, String bloodGroup, String allergies,
			String addedBy, LocalDateTime timeAdded) {
		super();
		this.id = id;
		this.sirName = sirName;
		this.burtisimalName = burtisimalName;
		this.middleName = middleName;
		this.gender = gender;
		this.residence = residence;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.nationalIdNumber = nationalIdNumber;
		this.bloodGroup = bloodGroup;
		this.allergies = allergies;
		this.addedBy = addedBy;
		this.timeAdded = timeAdded;
	}
	private String nationalIdNumber;
    private String bloodGroup;
    private String allergies;
    private String addedBy;
    private LocalDateTime timeAdded;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSirName() {
		return sirName;
	}
	public void setSirName(String sirName) {
		this.sirName = sirName;
	}
	public String getBurtisimalName() {
		return burtisimalName;
	}
	public void setBurtisimalName(String burtisimalName) {
		this.burtisimalName = burtisimalName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNationalIdNumber() {
		return nationalIdNumber;
	}
	public void setNationalIdNumber(String nationalIdNumber) {
		this.nationalIdNumber = nationalIdNumber;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public LocalDateTime getTimeAdded() {
		return timeAdded;
	}
	public void setTimeAdded(LocalDateTime timeAdded) {
		this.timeAdded = timeAdded;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
