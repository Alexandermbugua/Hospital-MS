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
    public String showSearch(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        return "patients/search";
    }

    @PostMapping("/search")
    public String searchPatient(@RequestParam(required = false) String nationalIdNumber,
                               @RequestParam(required = false) String phoneNumber,
                               @RequestParam(required = false) String fullName,
                               Model model) {
        
        Patient foundPatient = null;
        
        if (nationalIdNumber != null && !nationalIdNumber.trim().isEmpty()) {
            foundPatient = patientService.findByNationalId(nationalIdNumber.trim());
        }
        
        if (foundPatient == null && phoneNumber != null && !phoneNumber.trim().isEmpty()) {
            foundPatient = patientService.findByPhone(phoneNumber.replaceAll("\\D", ""));
        }
        
        if (foundPatient == null && fullName != null && !fullName.trim().isEmpty()) {
            foundPatient = patientService.findByName(fullName.trim());
        }

        if (foundPatient != null) {
            model.addAttribute("patient", foundPatient);
            return "patients/found";
        }

        return "redirect:/patients/new";
    }

    @GetMapping("/found")
    public String showFoundPatient(@RequestParam(required = false) Long id, Model model) {
        if (id != null) {
            Patient patient = patientService.getPatientById(id);
            if (patient != null) {
                model.addAttribute("patient", patient);
            }
        }
        return "patients/found";
    }
}