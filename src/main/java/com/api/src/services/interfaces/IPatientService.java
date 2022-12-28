package com.api.src.services.interfaces;

import com.api.src.entity.Patient;

public interface IPatientService {
    public Patient create (Patient patient);
    public Patient UpdateById (String id, Patient patient);
    public Patient getById (String id);
    public Patient getAll ();
    public void deleteById(String id);
}
