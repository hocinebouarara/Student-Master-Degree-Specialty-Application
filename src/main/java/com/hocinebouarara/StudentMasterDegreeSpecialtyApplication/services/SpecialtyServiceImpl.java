package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao.SpecialtyRepository;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyServiceImpl implements SpecialtyService{

    private SpecialtyRepository specialtyRepository;

    public SpecialtyServiceImpl(SpecialtyRepository theSpecialtyRepository){
        specialtyRepository = theSpecialtyRepository;
    }

    @Override
    public List<Specialty> findAll() {
        return specialtyRepository.findAll();
    }

    @Override
    public Optional<Specialty> findById(Long theId) {
        return specialtyRepository.findById(theId);
    }

    @Override
    public void save(Specialty theSpecialty) {

    }
    @Override
    public void deleteById(Long theId) {

    }
}
