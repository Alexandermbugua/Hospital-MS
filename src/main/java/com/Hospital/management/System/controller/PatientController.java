package com.Hospital.management.System.controller;

import com.Hospital.management.System.entity.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {
    
    private List<Patient> dummyPatients = new ArrayList<>();
    
    public PatientController() {
        Patient dummyPatient = new Patient();
        dummyPatient.setId(1L);
        dummyPatient.setSirName("Mwangi");
        dummyPatient.setBurtisimalName("John");
        dummyPatient.setMiddleName("Kamau");
        dummyPatient.setDateOfBirth(LocalDate.of(1985, 6, 15));
        dummyPatient.setResidence("Nairobi, Kenya");
        dummyPatient.setGender(Patient.Gender.MALE);
        dummyPatient.setPhoneNumber("0712345678");
        dummyPatient.setNationalIdNumber("12345678");
        dummyPatient.setBloodGroup(Patient.BloodGroup.O_POSITIVE);
        dummyPatient.setAllergies("None known");
        
        dummyPatients.add(dummyPatient);
    }
    
    @GetMapping
    public String listPatients(Model model) {
        model.addAttribute("patients", dummyPatients);
        return "patients/list";
    }
    
    @GetMapping("/new")
    public String showNewPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patients/form";
    }
    
    @GetMapping("/edit/{id}")
    public String showEditPatientForm(@PathVariable("id") Long id, Model model) {
        Patient patientToEdit = dummyPatients.stream()
                .filter(patient -> patient.getId().equals(id))
                .findFirst()
                .orElse(new Patient());
        model.addAttribute("patient", patientToEdit);
        return "patients/form";
    }
    
    @PostMapping("/save")
    public String savePatient(@ModelAttribute("patient") Patient patient) {
        if (patient.getId() != null) {
            for (int i = 0; i < dummyPatients.size(); i++) {
                if (dummyPatients.get(i).getId().equals(patient.getId())) {
                    dummyPatients.set(i, patient);
                    break;
                }
            }
        } else {
            patient.setId((long) (dummyPatients.size() + 1));
            dummyPatients.add(patient);
        }
        return "redirect:/patients";
    }
}