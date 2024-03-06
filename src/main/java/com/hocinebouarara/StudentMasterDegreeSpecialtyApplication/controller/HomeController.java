package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // get home page
    @GetMapping("/")
    public String getHomePage(){
        return "test";
    }

    @GetMapping("/studies")
    public String getStudiesPage(){
        return "studies";
    }

}
