package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

     Student findById(Long theId);

    void save(Student theEmployee);

    void deleteById(Long theId);
}
