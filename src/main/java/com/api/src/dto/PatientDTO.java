package com.api.src.dto;

import com.api.src.entity.Doctor;
import com.api.src.entity.Hospital;
import com.api.src.entity.Report;
import lombok.*;

import java.util.ArrayList;
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
