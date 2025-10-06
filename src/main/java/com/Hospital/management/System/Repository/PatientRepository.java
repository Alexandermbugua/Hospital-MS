package com.Hospital.management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.management.System.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
