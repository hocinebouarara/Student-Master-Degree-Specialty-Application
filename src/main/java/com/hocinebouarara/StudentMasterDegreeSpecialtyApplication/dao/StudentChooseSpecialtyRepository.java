package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entity.Student;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entity.StudentChooseSpecialties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentChooseSpecialtyRepository extends JpaRepository<StudentChooseSpecialties,Long> {
}