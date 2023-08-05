package com.hackathon.team34.patientservice.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hackathon.team34.patientservice.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    
}
