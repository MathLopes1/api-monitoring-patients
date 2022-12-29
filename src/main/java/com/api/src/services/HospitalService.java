package com.api.src.services;

import com.api.src.domain.Hospital;
import com.api.src.domain.Patient;
import com.api.src.repositories.HospitalRepository;
import com.api.src.services.interfaces.IHospitalService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HospitalService implements IHospitalService {

    private final HospitalRepository hospitalRepository;

    protected HospitalService(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public Hospital create(Hospital hospital) {
        hospital.setCreatedAt(LocalDateTime.now());
        hospital.setUpdatedAt(LocalDateTime.now());

        this.hospitalRepository.save(hospital);
        return hospital;
    }

    @Override
    public Hospital UpdateById(String id, Hospital hospital) {
        return null;
    }

    @Override
    public Hospital getById(String id) {
        return null;
    }

    @Override
    public List<Hospital> getAll() {
        List<Hospital> Hospitals = this.hospitalRepository.findAll();
        return Hospitals;
    }

    @Override
    public void deleteById(String id) {

    }
}
