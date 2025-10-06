package com.Hospital.management.System.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "patients")
public class Patient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "sir_name", nullable = false)
    private String sirName;
    
    @Column(name = "burtisimal_name", nullable = false)
    private String burtisimalName;
    
    @Column(name = "middle_name")
    private String middleName;
    
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;
    
    @Column(name = "residence", nullable = false)
    private String residence;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;
    
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    
    @Column(name = "national_id_number", nullable = false, unique = true)
    private String nationalIdNumber;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "blood_group")
    private BloodGroup bloodGroup;
    
    @Column(name = "allergies", columnDefinition = "TEXT")
    private String allergies;
    
    public Patient() {}
    
    public Patient(String sirName, String burtisimalName, String middleName, LocalDate dateOfBirth, 
                   String residence, Gender gender, String phoneNumber, String nationalIdNumber, 
                   BloodGroup bloodGroup, String allergies) {
        this.sirName = sirName;
        this.burtisimalName = burtisimalName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.residence = residence;
        this.gender = gender;
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
    
    public String getResidence() {
        return residence;
    }
    
    public void setResidence(String residence) {
        this.residence = residence;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public void setGender(Gender gender) {
        this.gender = gender;
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
    
    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }
    
    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    public String getAllergies() {
        return allergies;
    }
    
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
    public enum Gender {
        MALE, FEMALE, OTHER
    }
    
    public enum BloodGroup {
        A_POSITIVE, A_NEGATIVE, B_POSITIVE, B_NEGATIVE, 
        AB_POSITIVE, AB_NEGATIVE, O_POSITIVE, O_NEGATIVE
    }
}