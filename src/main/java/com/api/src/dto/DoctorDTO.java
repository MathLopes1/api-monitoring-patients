package com.api.src.dto;

import com.api.src.entity.Hospital;
import com.api.src.entity.Patient;
import com.api.src.entity.Report;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DoctorDTO extends PeopleDTO {

	private Long id;

	private String crm;

	private Hospital hospital;

	private List<Patient> patients;

	private List<Report> reports;
}
