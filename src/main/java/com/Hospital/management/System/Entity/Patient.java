package com.Hospital.management.System.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Surname;
	private String Baptismalname;
	private String Middlename;
	private String Residence;
	private String Gender;
	private LocalDate dateOfBirth;
	private int phonenumber;
	private int NationalId;
	private String Bloodgroup;
	private String Allergies;
	private String addedBy;
	private LocalDateTime timeAdded; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getBaptismalname() {
		return Baptismalname;
	}
	public void setBaptismalname(String baptismalname) {
		Baptismalname = baptismalname;
	}
	public String getMiddlename() {
		return Middlename;
	}
	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}
	public String getResidence() {
		return Residence;
	}
	public void setResidence(String residence) {
		Residence = residence;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getNationalId() {
		return NationalId;
	}
	public void setNationalId(int nationalId) {
		NationalId = nationalId;
	}
	public String getBloodgroup() {
		return Bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		Bloodgroup = bloodgroup;
	}
	public String getAllergies() {
		return Allergies;
	}
	public void setAllergies(String allergies) {
		Allergies = allergies;
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
