package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAll();

    Specialty findById(int theId);

    void save(Teacher theTeacher);

    void deleteById(int theId);
}
