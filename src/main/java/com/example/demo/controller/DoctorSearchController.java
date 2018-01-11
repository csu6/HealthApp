package com.example.demo.controller;

import com.example.demo.entities.Doctor;
import com.example.demo.helpers.DoctorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DoctorService;

import java.util.*;

@RestController
public class DoctorSearchController {

    @Autowired
    DoctorService docService;

    //public DoctorInfo searchDoctor(
    public List<Doctor> searchDoctor(
            @RequestParam(value="location", required=false) String location,
            @RequestParam(value="speciality", required=false) String speciality
    ){
        //DoctorInfo doctorList = docService.find(location, speciality);

        List<Doctor> doctorList = docService.findByLocationAndSpeciality(location, speciality);

        return doctorList;
    }
}
