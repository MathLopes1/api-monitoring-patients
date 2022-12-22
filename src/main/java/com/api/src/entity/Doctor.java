package com.api.src.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_doctor")
public class Doctor extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	private String name;
	
	private String crm;

	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;

	@OneToMany(mappedBy = "doctor")
	private List<Patient> patients;

	@OneToMany(mappedBy = "doctor")
    private List<Report> reports;
	
	public Doctor() {}
	
	public Doctor(Long id, String name, String crm, Hospital hospital, ArrayList<Patient> patients, ArrayList<Report> reports) {
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
