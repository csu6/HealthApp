package com.example.demo.repositories;

import com.example.demo.entities.Doctor;

import java.util.List;


public interface DoctorDAO {

    List<Doctor> findAll();

    List<Doctor> findByLocationAndSpeciality(String location, String speciality);

    List<Doctor> findBySpecialityCode(String code);

    int findAllCount();

    List<Doctor> findByLocation(String location);

    List<Doctor> findByHospital(String hospitalName);

    Doctor findByUserId(int userId);

    Doctor save(Doctor doctor);
}
