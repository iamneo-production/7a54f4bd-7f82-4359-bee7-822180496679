package com.hackathon.team34.appointmentservice.service;

import com.hackathon.team34.appointmentservice.entity.Appointment;

public interface AppointmentService {
    //Appointment Operations

    //schedule appointment
    Appointment scheduleAppointment(Appointment appointment);

    //view appointment
    Appointment viewAppointment(Integer appointmentId);

}
