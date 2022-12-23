package com.api.src.dto;

import com.api.src.entity.Doctor;
import com.api.src.entity.Patient;

import java.util.ArrayList;
import java.util.List;

public class HospitalDTO extends AbstractDTO {


	private Long id;

	private String name;

	private String state;

	private String city;

	private String addres;

	private List<Doctor> doctors;

	private List<Patient> patients;

	public HospitalDTO() {}

	public HospitalDTO(Long id, String name, String state, String city, String addres, ArrayList<Doctor> doctors, ArrayList<Patient> patients) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.city = city;
		this.addres = addres;
		this.doctors = doctors;
		this.patients = patients;
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
	
	public String getAddres() {
		return this.addres;
	}
	
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public List<Doctor> getDoctors() {
		return doctors;
	}
	
	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	public List<Patient> getPatients() {
		return patients;
	}
	
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
}
