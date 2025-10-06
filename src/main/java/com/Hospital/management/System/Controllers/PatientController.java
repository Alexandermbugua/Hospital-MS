package com.Hospital.management.System.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Hospital.management.System.Entity.Patient;
import com.Hospital.management.System.Service.PatientService;

@Controller
public class PatientController {
	
	
	@GetMapping("/Patients")
	public ModelAndView getAllpatients() {
		List<Patient>list=service.getAllPatient();
		return new ModelAndView("list","patient",list);
	}
	
	
	

	@Autowired
	private PatientService service;
	
	@PostMapping("/save")
	public String AddPatient(@ModelAttribute Patient p) {
		service.save(p);
		return "redirect:/Patients";
	}
}
