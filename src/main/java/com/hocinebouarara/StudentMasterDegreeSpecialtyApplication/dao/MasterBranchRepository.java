package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.MasterBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterBranchRepository extends JpaRepository<MasterBranch,Long> {

    // retrieve branch of master by title
    public MasterBranch findFirstByTitle(String title);
}
