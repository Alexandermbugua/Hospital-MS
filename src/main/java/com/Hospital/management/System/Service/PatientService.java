package com.Hospital.management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.management.System.Repository.PatientRepository;
import com.Hospital.management.System.entity.Patient;

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
	
	public Patient FindByNationalIdOrTelephoneNumber(String telorNationalId) {
		//--------instructions
		return null;
	}
}
