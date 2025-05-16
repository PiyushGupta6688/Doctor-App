package com.doctor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.models.Appointments;
import com.doctor.repo.AppointmentRepo;

import jakarta.transaction.Transactional;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepo appointmentRepo;

	public List<Appointments> getByUserEmail(String userEmail) {
		return appointmentRepo.getByUserEmail(userEmail);
	}

	public List<Appointments> getByDoctorEmail(String doctorEmail) {
		return appointmentRepo.getByDoctorEmail(doctorEmail);
	}
	
	public boolean delete(int id) {
		return appointmentRepo.delete(id);
	}

	public String addAppointment(Appointments appointment) {
		return appointmentRepo.addAppointment(appointment);
	}

	public boolean updateStatus(int id, String status) {
		return appointmentRepo.updateStatus(id,status);
	}
	
}
