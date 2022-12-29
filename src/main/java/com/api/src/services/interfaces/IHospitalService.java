package com.api.src.services.interfaces;

import com.api.src.domain.Hospital;

import java.util.List;

public interface IHospitalService {
    public Hospital create (Hospital hospital);
    public Hospital UpdateById (String id, Hospital hospital);
    public Hospital getById (String id);
    public List<Hospital> getAll ();
    public void deleteById(String id);
}
