package com.Hospital.management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.management.System.Entity.Patient;
import com.Hospital.management.System.Repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository pRepo;
	
	public void save(Patient p) {
		pRepo.save(p);
		
	}
	
	public List<Patient> getAllPatient(){
		return pRepo.findAll();
	}
}
