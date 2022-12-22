package com.api.src.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "tb_report")
public class Report extends AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private Integer bloodPressure;
	private Integer glucose;
	private Integer BPM;
	private String Description;
	private LocalDateTime date;

	@ManyToOne
	@JoinColumn(name="doctor_id")
	private Doctor doctor;

	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	public Report() {}
	
	public Report(Long id, Integer bloodPressure, Integer glucose, Integer bPM, String description, LocalDateTime date,
			Doctor doctor, Patient patient) {
		super();
		this.id = id;
		this.bloodPressure = bloodPressure;
		this.glucose = glucose;
		this.BPM = bPM;
		this.Description = description;
		this.date = date;
		this.doctor = doctor;
		this.patient = patient;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public Integer getGlucose() {
		return glucose;
	}

	public void setGlucose(Integer glucose) {
		this.glucose = glucose;
	}

	public Integer getBPM() {
		return BPM;
	}

	public void setBPM(Integer bPM) {
		BPM = bPM;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
}
