package com.api.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.src.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> { }
