package com.api.src.services;

import com.api.src.domain.Doctor;
import com.api.src.repositories.DoctorRepository;
import com.api.src.services.interfaces.IDoctorService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DoctorService implements IDoctorService {

    private final DoctorRepository doctorRepository;

    protected DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Doctor create(Doctor doctor) {
        doctor.setCreatedAt(LocalDateTime.now());
        doctor.setUpdatedAt(LocalDateTime.now());

        this.doctorRepository.save(doctor);
        return doctor;
    }

    @Override
    public Doctor UpdateById(String id, Doctor doctor) {
        return null;
    }

    @Override
    public Doctor getById(String id) {
        return null;
    }

    @Override
    public Doctor getAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
