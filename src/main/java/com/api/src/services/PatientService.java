package com.api.src.services;

import com.api.src.domain.Patient;
import com.api.src.repositories.PatientRepository;
import com.api.src.services.interfaces.IPatientService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PatientService implements IPatientService {

    private final PatientRepository patientRepository;

    protected PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient create(Patient patient) {
        patient.setCreatedAt(LocalDateTime.now());
        patient.setUpdatedAt(LocalDateTime.now());

        this.patientRepository.save(patient);
        return patient;
    }

    @Override
    public Patient UpdateById(String id, Patient patient) {
        return null;
    }

    @Override
    public Patient getById(String id) {
        return null;
    }

    @Override
    public Patient getAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
