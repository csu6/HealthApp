package com.example.demo.service;

import com.example.demo.entities.Doctor;
import com.example.demo.entities.User;
import com.example.demo.repositories.DoctorDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("docService")
public class DoctorServiceImpl implements DoctorService {
    private DoctorDAO doctorDAO;

    @Override
    public void save(Doctor doctor) {

    }

    @Override
    public List<Doctor> findBySpeciality(String specialityCode) {
        return null;
    }

    @Override
    public List<Doctor> findByLocationAndSpeciality(String location, String speciality) {
        return doctorDAO.findByLocationAndSpeciality(location, speciality);
    }

    @Override
    public List<Doctor> findByLocation(String location) {
        return null;
    }

    @Override
    public List<Doctor> findByHospital(String hospitalName) {
        return null;
    }

    @Override
    public List<Doctor> findAll() {
        return null;
    }

    @Override
    public Doctor findByUserEmailAddress(String email) {
        return null;
    }

    @Override
    public int findCount() {
        return 0;
    }

    @Override
    public Doctor findByUserId(int userId) {
        return null;
    }

    @Override
    public void addDoctor(User user) {

    }

}
