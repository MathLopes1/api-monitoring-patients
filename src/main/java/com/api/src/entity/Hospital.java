package com.api.src.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_hospital")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Hospital extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	private String name;
	
	private String state;
	
	private String city;
	
	private String address;

	@OneToMany(mappedBy = "hospital")
	private List<Doctor> doctors;

	@OneToMany(mappedBy = "hospital")
	private List<Patient> patients;
}
