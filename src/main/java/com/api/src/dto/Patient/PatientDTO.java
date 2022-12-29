package com.api.src.dto.Patient;

import com.api.src.domain.Doctor;
import com.api.src.domain.Hospital;
import com.api.src.domain.Report;
import com.api.src.dto.AbstractDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PatientDTO extends AbstractDTO {

	private Long id;

	private String name;

	private String cpf;

	private String adress;

	private String state;

	private String city;

	private Doctor doctor;

	private Hospital hospital;

	private List<Report> reports;
}
