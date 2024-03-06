package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao.MasterBranchRepository;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.dao.StudentRepository;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.MasterBranch;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterBranchServiceImpl implements MasterBranchService{

    private MasterBranchRepository masterBranchRepository;

    @Autowired
    public MasterBranchServiceImpl(MasterBranchRepository theMasterBranchRepository){
        masterBranchRepository = theMasterBranchRepository;
    }
    @Override
    public List<MasterBranch> getAllMasterBranches() {
        return masterBranchRepository.findAll();
    }

    @Override
    public MasterBranch findById(Long theId) {
        return null;
    }

    @Override
    public void save(MasterBranch theMasterBranch) {

    }

    @Override
    public void deleteById(Long theId) {

    }
}
