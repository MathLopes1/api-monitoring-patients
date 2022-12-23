package com.api.src.services.interfaces;

import com.api.src.entity.Doctor;

public interface IDoctorService {
    public Doctor create (Doctor doctor);
    public Doctor UpdateById (String id, Doctor doctor);
    public Doctor getById (String id);
    public Doctor getAll ();
    public void deleteById(String id);
}
