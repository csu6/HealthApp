package com.example.demo.service;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.User;

import java.util.List;

public interface DoctorService {

    void save(Doctor doctor);

    List<Doctor> findBySpeciality(String specialityCode);

    public List<Doctor> findByLocationAndSpeciality(String location, String speciality);

    List<Doctor> findByLocation(String location);

    List<Doctor> findByHospital(String hospitalName);

    List<Doctor> findAll();

    Doctor findByUserEmailAddress(String email);

    int findCount();

    Doctor findByUserId(int userId);

    void addDoctor(User user);
}
