package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.StudentSubject;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentSubjectServiceImpl implements StudentSubjectService{
    @Override
    public List<StudentSubject> findAll() {
        return null;
    }

    @Override
    public StudentSubject findById(Long theId) {
        return null;
    }

    @Override
    public void save(StudentSubject theStudentSubject) {

    }

    @Override
    public void deleteById(Long theId) {

    }
}
