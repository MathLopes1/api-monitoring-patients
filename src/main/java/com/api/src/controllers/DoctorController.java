package com.api.src.controllers;

import com.api.src.dto.Doctor.DoctorDTO;
import com.api.src.domain.Doctor;
import com.api.src.services.DoctorService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "doctors")
public class DoctorController {

    private DoctorService doctorService;

    private ModelMapper modelMapper;

    public DoctorController(DoctorService doctorService, ModelMapper modelMapper) {
        this.doctorService = doctorService;
        this.modelMapper = modelMapper;
    }

    private DoctorDTO toDoctorlDTO (Doctor doctor) {
        return this.modelMapper.map(doctor, DoctorDTO.class);
    }

    @PostMapping
    public ResponseEntity<DoctorDTO> create (@RequestBody DoctorDTO doctor) {
        Doctor newDoctor = this.modelMapper.map(doctor, Doctor.class);
        newDoctor = this.doctorService.create(newDoctor);

        return new ResponseEntity<DoctorDTO>(toDoctorlDTO(newDoctor), HttpStatus.CREATED);
    }
}
