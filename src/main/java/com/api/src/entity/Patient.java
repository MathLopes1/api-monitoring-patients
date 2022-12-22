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
@Table(name = "tb_patient")
public class Patient extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	private String name;
	
	private String cpf;
	
	private String adress;
	
	private String state;
	
	private String city;

	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;

	@OneToMany(mappedBy = "patient")
	private List<Report> reports;
	
	public Patient() {}
	
	public Patient(Long id, String name, String cpf, String adress, String city, String state, Doctor doctor, Hospital hospital,
			ArrayList<Report> reports) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.adress = adress;
		this.state = state;
		this.doctor = doctor;
		this.hospital = hospital;
		this.reports = reports;
		this.city = city;
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public Hospital getHospital() {
		return hospital;
	}
	
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
	public List<Report> getReports() {
		return reports;
	}
	
	public void setReports(ArrayList<Report> reports) {
		this.reports = reports;
	}
}
