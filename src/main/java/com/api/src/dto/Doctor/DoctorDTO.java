package com.api.src.dto.Doctor;

import com.api.src.domain.Hospital;
import com.api.src.domain.Patient;
import com.api.src.domain.Report;
import com.api.src.dto.PeopleDTO;
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
