package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findAll();
    List<Subject> findAllBySpecialty(Specialty theSpecialty);

    Subject findById(Long theId);

    void save(Subject theSubject);

    void deleteById(Long theId);
}
