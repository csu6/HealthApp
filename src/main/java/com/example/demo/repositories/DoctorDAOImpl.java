package com.example.demo.repositories;

import com.example.demo.entities.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DoctorDAOImpl implements DoctorDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public  DoctorDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<Doctor> findByLocationAndSpeciality(String location, String speciality) {
        Session session = this.sessionFactory.getCurrentSession();
        TypedQuery<Doctor> query = (TypedQuery<Doctor>) session.getNamedQuery("findByLocationAndSpeciality");
        query.setParameter("location", location);
        query.setParameter("speciality", speciality);
        List<Doctor> doctors = query.getResultList();
        return doctors;
    }

    @Override
    public List<Doctor> findAll() {
        return null;
    }

    @Override
    public List<Doctor> findBySpecialityCode(String code) {
        return null;
    }

    @Override
    public int findAllCount() {
        return 0;
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
    public Doctor findByUserId(int userId) {
        return null;
    }

    @Override
    public Doctor save(Doctor doctor) {
        return null;
    }
}
