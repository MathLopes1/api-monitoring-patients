package com.api.src.services;

import com.api.src.entity.Hospital;
import com.api.src.repositories.HospitalRepository;
import com.api.src.services.interfaces.IHospitalService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HospitalService implements IHospitalService {

    private final HospitalRepository hospitalRepository;

    protected HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    public Hospital create(Hospital hospital) {
        hospital.setCreatedAt(LocalDateTime.now());
        hospital.setUpdatedAt(LocalDateTime.now());

        this.hospitalRepository.save(hospital);
        return hospital;
    }

    public Hospital UpdateById(String id, Hospital hospital) {
        return null;
    }

    public Hospital getById(String id) {
        return null;
    }

    public Hospital getAll() {
        return null;
    }

    public void deleteById(String id) {

    }
}
