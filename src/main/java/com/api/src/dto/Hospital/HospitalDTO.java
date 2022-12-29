package com.api.src.dto.Hospital;

import com.api.src.domain.Doctor;
import com.api.src.domain.Patient;
import com.api.src.dto.AbstractDTO;
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

	private List<DoctorForListHospitalDTO> doctors;

	private List<PatientForListHospitalDTO> patients;
}
