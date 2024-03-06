package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.controller;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Student;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DashboardController {

    // the field for injecting the services
    private StudentService studentService;

    @Autowired
    public DashboardController(StudentService theStudentService){
        studentService =theStudentService;
    }

    @GetMapping("/dashboard")
    public String getDashboard(Model theModel){
// retrieve the students from the database
        List<Student> students = studentService.findAll();

        // add them to the model
        theModel.addAttribute("students",students);
        return "dashboard";
    }

}
