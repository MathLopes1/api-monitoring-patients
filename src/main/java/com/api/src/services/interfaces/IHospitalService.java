package com.api.src.services.interfaces;

import com.api.src.entity.Hospital;

public interface IHospitalService {
    public Hospital create (Hospital hospital);
    public Hospital UpdateById (String id, Hospital hospital);
    public Hospital getById (String id);
    public Hospital getAll ();
    public void deleteById(String id);
}
