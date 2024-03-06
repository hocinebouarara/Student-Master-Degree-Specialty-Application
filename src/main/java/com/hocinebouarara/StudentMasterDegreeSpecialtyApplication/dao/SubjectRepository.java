package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {

    // get all subject by specialty
    List<Subject> findBySpecialty(Specialty specialty);

}
