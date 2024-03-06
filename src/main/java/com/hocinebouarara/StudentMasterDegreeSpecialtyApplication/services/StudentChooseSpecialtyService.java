package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.StudentChooseSpecialties;

import java.util.List;

public interface StudentChooseSpecialtyService {
    List<StudentChooseSpecialties> findAll();

    StudentChooseSpecialties findById(Long theId);

    void save(StudentChooseSpecialties theStudentChooseSpecialties);

    void deleteById(Long theId);
}
