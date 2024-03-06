package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.MasterBranch;

import java.util.List;

public interface MasterBranchService {

    List<MasterBranch> getAllMasterBranches();

    MasterBranch findById(Long theId);

    void save(MasterBranch theMasterBranch);

    void deleteById(Long theId);
}
