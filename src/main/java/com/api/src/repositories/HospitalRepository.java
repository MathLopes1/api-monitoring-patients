package com.api.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.src.domain.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Long> { }