package com.api.src.dto;

import com.api.src.entity.Doctor;
import com.api.src.entity.Patient;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class HospitalDTO extends AbstractDTO {


	private Long id;

	private String name;

	private String state;

	private String city;

	private String address;

	private List<Doctor> doctors;

	private List<Patient> patients;
}
