package com.Hospital.management.System.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Hospital.management.System.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	Optional<Patient> findByNationalIdNumber(String nationalIdNumber);
    
    Optional<Patient> findByPhoneNumber(String phoneNumber);
    
    @Query("SELECT p FROM Patient p WHERE CONCAT(p.sirName, ' ', p.burtisimalName, ' ', COALESCE(p.middleName, '')) LIKE %:name%")
    List<Patient> findByNameContaining(@Param("name") String name);
}