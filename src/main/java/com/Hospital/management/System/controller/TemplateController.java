package com.Hospital.management.System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/patients")
    public String patients() {
        return "patients/patients-list";
    }
    
    @GetMapping("/patients/search")
    public String searchPatient() {
        return "patients/search";
    }
    
    @GetMapping("/patients/found")
    public String patientFound() {
        return "patients/found";
    }
    
    @GetMapping("/patients/new")
    public String newPatient() {
        return "patients/new";
    }
    
    @GetMapping("/patients/edit/{id}")
    public String editPatient() {
        return "patients/patient-form";
    }
    
}