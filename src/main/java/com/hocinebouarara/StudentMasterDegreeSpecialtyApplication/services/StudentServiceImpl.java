package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao.StudentRepository;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository theStudentRepository){
        studentRepository = theStudentRepository;
    }
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long theId) {
        return null;
    }

    @Override
    public void save(Student theEmployee) {

    }

    @Override
    public void deleteById(Long theId) {

    }
}
