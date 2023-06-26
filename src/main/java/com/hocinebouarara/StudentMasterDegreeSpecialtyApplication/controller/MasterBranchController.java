package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.controller;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.MasterBranch;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services.MasterBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MasterBranchController {

    // inject of master branch service
    private MasterBranchService masterBranchService;

    @Autowired
    public MasterBranchController(MasterBranchService theMasterBranchService){
        masterBranchService = theMasterBranchService;
    }

    // get index page
    @GetMapping("/")
    public String startPage(){
        return "index";
    }

    @GetMapping("/specialties")
    public String specialtiesPage(Model model) {

        // Retrieve the title from the database
        List<MasterBranch> masterBranches = masterBranchService.getAllMasterBranches();

        // Add the list of master branches to the model
        model.addAttribute("masterBranches", masterBranches);


        return "specialties";
    }
}
