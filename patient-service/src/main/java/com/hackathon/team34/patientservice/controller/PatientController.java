package com.hackathon.team34.patientservice.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hackathon.team34.patientservice.entity.Patient;
import com.hackathon.team34.patientservice.service.PatientServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value="api/patients")
public class PatientController {

    @Autowired
    PatientServiceImpl patientServiceImpl;

    @PostMapping("/register")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient)
    {
        Patient patient1=patientServiceImpl.addPatient(patient);
        return new ResponseEntity<Patient>(patient1,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
	public ResponseEntity<Patient> getPatient(@PathVariable Integer id)
	{
		Patient patient1=patientServiceImpl.getPatient(id);
		return new ResponseEntity<Patient>(patient1,HttpStatus.OK);
	}

    @GetMapping
    public String demo()
    {
        return "I am working on port 9001";
    }

}
