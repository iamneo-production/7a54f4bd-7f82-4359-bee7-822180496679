package com.hackathon.team34.appointmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.team34.appointmentservice.entity.Appointment;
import com.hackathon.team34.appointmentservice.service.AppointmentServiceImpl;

@RestController
@RequestMapping("api/appointments")
public class AppointmentController {

    @Autowired
    AppointmentServiceImpl appointmentServiceImpl;

    @PostMapping("/scheduleAppointment")
    public ResponseEntity<Appointment> takeAppointment(@RequestBody Appointment appointment)
	{
		 Appointment apt=appointmentServiceImpl.scheduleAppointment(appointment);
		 return new ResponseEntity<Appointment>(apt,HttpStatus.CREATED);
	}
    

    @GetMapping("/viewApts/{aptId}")
	public ResponseEntity<Appointment> takeAppointments(@PathVariable Integer aptId)
	{
		System.out.println("hey");
		 Appointment apt=appointmentServiceImpl.viewAppointment(aptId);
		 return new ResponseEntity<Appointment>(apt,HttpStatus.OK);
	}
}
