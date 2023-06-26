package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpecialtyController {

    // get the details of each specialty
    @GetMapping("/specialties/{specialtyId}")
    public String getSpecialtyInfo(long specialtyId){
        return "s";
    }
}
