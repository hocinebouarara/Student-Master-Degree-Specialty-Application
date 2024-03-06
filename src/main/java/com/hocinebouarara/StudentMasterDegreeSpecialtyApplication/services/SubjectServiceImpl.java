package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao.SubjectRepository;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private SubjectRepository subjectRepository;
    @Autowired
    public SubjectServiceImpl(SubjectRepository theSubjectRepository){
        subjectRepository = theSubjectRepository;
    }
    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public List<Subject> findAllBySpecialty(Specialty theSpecialty) {
        return subjectRepository.findBySpecialty(theSpecialty);
    }

    @Override
    public Subject findById(Long theId) {
        return null;
    }

    @Override
    public void save(Subject theSubject) {

    }

    @Override
    public void deleteById(Long theId) {

    }
}
