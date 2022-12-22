package com.api.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.src.entity.Doctor;


public interface DoctorRepository extends JpaRepository<Doctor, Long> { }