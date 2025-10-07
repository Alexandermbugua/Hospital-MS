package com.Hospital.management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.management.System.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
	
	public Patient FindByNationalIdOrTelephoneNumber(String telorNationalId);

}
