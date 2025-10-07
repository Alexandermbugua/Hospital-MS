package com.Hospital.management.System.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.management.System.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	Optional<Patient> findByNationalIdNumber(String nationalIdNumber);
    
    Optional<Patient> findByPhoneNumber(String phoneNumber);
}