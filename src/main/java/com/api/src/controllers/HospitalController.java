package com.api.src.controllers;

import com.api.src.dto.Hospital.HospitalDTO;
import com.api.src.domain.Hospital;
import com.api.src.services.HospitalService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping
    public ResponseEntity<List<HospitalDTO>> getAll () {
        List<Hospital> hospitals = this.hospitalService.getAll();
        List<HospitalDTO> listDto = hospitals
                .stream()
                .map(hospital -> this.toHospitalDTO(hospital))
                .collect(Collectors.toList());

        return new ResponseEntity<List<HospitalDTO>>(listDto, HttpStatus.OK);
    }
}
