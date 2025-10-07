package com.Hospital.management.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hospital.management.System.Repository.PatientRepository;
import com.Hospital.management.System.entity.Patient;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }
    
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
    
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
    
    public Patient findByNationalId(String nationalId) {
        return patientRepository.findByNationalIdNumber(nationalId).orElse(null);
    }
    
    public Patient findByPhone(String phone) {
        return patientRepository.findByPhoneNumber(phone).orElse(null);
    }
}
