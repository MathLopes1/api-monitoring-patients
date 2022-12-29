package com.api.src.domain;

import lombok.*;

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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Doctor extends People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	private String crm;
	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;

	@OneToMany(mappedBy = "doctor")
	private List<Patient> patients;

	@OneToMany(mappedBy = "doctor")
    private List<Report> reports;
}
