package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.StudentChooseSpecialties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentChooseSpecialtyRepository extends JpaRepository<StudentChooseSpecialties,Long> {
}
