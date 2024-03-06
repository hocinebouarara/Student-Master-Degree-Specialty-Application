package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSubjectRepository extends JpaRepository<StudentSubject,Long> {
}
