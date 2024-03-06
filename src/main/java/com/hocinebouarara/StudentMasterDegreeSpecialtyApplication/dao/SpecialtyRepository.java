package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository extends JpaRepository<Specialty,Long> {
}
