package com.api.src.dto;

import com.api.src.entity.AbstractEntity;
import com.api.src.entity.Hospital;
import com.api.src.entity.Patient;
import com.api.src.entity.Report;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDTO extends AbstractEntity {

	private Long id;

	private String name;

	private String crm;

	private Hospital hospital;

	private List<Patient> patients;

    private List<Report> reports;

	public DoctorDTO() {}

	public DoctorDTO(Long id, String name, String crm, Hospital hospital, ArrayList<Patient> patients, ArrayList<Report> reports) {
		super();
		this.id = id;
		this.name = name;
		this.crm = crm;
		this.hospital = hospital;
		this.patients = patients;
		this.reports = reports;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCrm() {
		return crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public Hospital getHospital() {
		return hospital;
	}
	
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	public List<Patient> getPatients() {
		return patients;
	}
	
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	
	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}
}
