package com.hackathon.team34.patientservice.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.team34.patientservice.entity.Patient;
import com.hackathon.team34.patientservice.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;


    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }


	@Override
	public Patient getPatient(Integer id) {
        Optional<Patient> patient = patientRepository.findById(id);
		if (patient.isEmpty())
			return null;
        return patient.get();
	}
}
