package com.Hospital.management.System.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sirName;
    private String burtisimalName;
    private String middleName;
    private LocalDate dateOfBirth;
    private String gender;
    private String residence;
    private String phoneNumber;
    private String nationalIdNumber;
    private String bloodGroup;
    private String allergies;
    
    
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long id, String sirName, String burtisimalName, String middleName, LocalDate dateOfBirth,
			String gender, String residence, String phoneNumber, String nationalIdNumber, String bloodGroup,
			String allergies) {
		super();
		this.id = id;
		this.sirName = sirName;
		this.burtisimalName = burtisimalName;
		this.middleName = middleName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.residence = residence;
		this.phoneNumber = phoneNumber;
		this.nationalIdNumber = nationalIdNumber;
		this.bloodGroup = bloodGroup;
		this.allergies = allergies;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
    
}