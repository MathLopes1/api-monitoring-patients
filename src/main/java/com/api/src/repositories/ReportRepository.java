package com.api.src.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.src.domain.Report;

public interface ReportRepository extends JpaRepository<Report, Long> { }