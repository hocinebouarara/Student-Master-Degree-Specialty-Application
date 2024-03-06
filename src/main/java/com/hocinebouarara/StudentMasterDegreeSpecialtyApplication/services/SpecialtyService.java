package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;

import java.util.List;
import java.util.Optional;

public interface SpecialtyService {
    List<Specialty> findAll();

    Optional<Specialty> findById(Long theId);

    void save(Specialty theSpecialty);

    void deleteById(Long theId);
}
