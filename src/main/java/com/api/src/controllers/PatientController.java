package com.api.src.controllers;

import com.api.src.dto.Patient.PatientDTO;
import com.api.src.domain.Patient;
import com.api.src.services.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "patients")
public class PatientController {

    private PatientService patientService;

    private ModelMapper modelMapper;

    public PatientController(PatientService patientService, ModelMapper modelMapper) {
        this.patientService = patientService;
        this.modelMapper = modelMapper;
    }

    private PatientDTO toPatientDTO (Patient patient) {
        return this.modelMapper.map(patient, PatientDTO.class);
    }

    @PostMapping
    public ResponseEntity<PatientDTO> create (@RequestBody PatientDTO patient) {
        Patient newPatient = this.modelMapper.map(patient, Patient.class);
        newPatient = this.patientService.create(newPatient);

        return new ResponseEntity<PatientDTO>(toPatientDTO(newPatient), HttpStatus.CREATED);
    }
}
