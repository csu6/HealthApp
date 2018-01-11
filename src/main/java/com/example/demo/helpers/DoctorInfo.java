package com.example.demo.helpers;

import com.example.demo.entities.Doctor;

import java.util.List;

// The class representing the list of Doctor; Returned as a response
public class DoctorInfo {
    private List<Doctor> doctors;

    public DoctorInfo(List<Doctor> doctors) {
        this.setDoctors(doctors);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
}