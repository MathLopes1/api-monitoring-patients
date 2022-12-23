package com.api.src.controllers;

import com.api.src.dto.HospitalDTO;
import com.api.src.entity.Hospital;
import com.api.src.services.HospitalService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "hospital")
public class HospitalController {

    private HospitalService hospitalService;

    private ModelMapper modelMapper;

    public HospitalController (HospitalService hospitalService, ModelMapper modelMapper) {
        this.hospitalService = hospitalService;
        this.modelMapper = modelMapper;
    }

    private HospitalDTO toHospitalDTO (Hospital hospital) {
        return this.modelMapper.map(hospital, HospitalDTO.class);
    }

    @PostMapping
    public ResponseEntity<HospitalDTO> create (@RequestBody HospitalDTO hospital) {
        Hospital newHospital = this.modelMapper.map(hospital, Hospital.class);
        newHospital = this.hospitalService.create(newHospital);

        return new ResponseEntity<HospitalDTO>(toHospitalDTO(newHospital), HttpStatus.CREATED);
    }
}
