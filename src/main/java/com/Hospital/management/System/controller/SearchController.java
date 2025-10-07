package com.Hospital.management.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Hospital.management.System.Service.PatientService;
import com.Hospital.management.System.entity.Patient;

@Controller
@RequestMapping("/patients")
public class SearchController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/search")
    public String showSearch() {
        return "patients/search";
    }

    @PostMapping("/search")
    public String searchPatient(@RequestParam String nationalIdNumber,
                               @RequestParam String phoneNumber,
                               Model model) {
        
        // Search by national ID
        if (!nationalIdNumber.isEmpty()) {
            Patient patient = patientService.findByNationalId(nationalIdNumber);
            if (patient != null) {
                model.addAttribute("patient", patient);
                return "patients/search";
            }
        }

        // Search by phone
        if (!phoneNumber.isEmpty()) {
            Patient patient = patientService.findByPhone(phoneNumber.replaceAll("\\D", ""));
            if (patient != null) {
                model.addAttribute("patient", patient);
                return "patients/search";
            }
        }

        // Not found - go to add form
        return "redirect:/patients/search/new?nationalId=" + nationalIdNumber + "&phone=" + phoneNumber;
    }

    @GetMapping("/search/new")
    public String newFromSearch(@RequestParam String nationalId, 
                               @RequestParam String phone, 
                               Model model) {
        Patient patient = new Patient();
        patient.setNationalIdNumber(nationalId);
        patient.setPhoneNumber(phone);
        model.addAttribute("patient", patient);
        return "patients/patient-form";
    }
}