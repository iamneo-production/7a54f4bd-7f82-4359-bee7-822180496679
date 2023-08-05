package com.hackathon.team34.patientservice.service;

import com.hackathon.team34.patientservice.entity.Patient;

public interface PatientService 
{
    //Patient Operations

    //add patient
    Patient addPatient(Patient patient);

    //get patient
    Patient getPatient(Integer id);
}
