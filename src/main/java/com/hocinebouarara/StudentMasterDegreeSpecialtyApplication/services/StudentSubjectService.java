package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.StudentSubject;

import java.util.List;

public interface StudentSubjectService {
    List<StudentSubject> findAll();

    StudentSubject findById(Long theId);

    void save(StudentSubject theStudentSubject);

    void deleteById(Long theId);
}
