package com.hackathon.team34.appointmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.team34.appointmentservice.entity.Appointment;
import com.hackathon.team34.appointmentservice.repository.AppointmentRepository;
import java.util.Optional;


@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    AppointmentRepository appointmentRepository;

	@Override
	public Appointment scheduleAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
	}

	@Override
	public Appointment viewAppointment(Integer appointmentId) {
		Optional<Appointment> appointment1=appointmentRepository.findById(appointmentId);
		if(appointment1.isPresent())
			return appointment1.get();
			
		return null;
	}
    
}
