package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.controller;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Student;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService theStudentService){
        studentService = theStudentService;
    }

//    @PostMapping("/save")
//    public String submitStudentDetails(@ModelAttribute("student") @Valid Student student, BindingResult result) {
//        if (result.hasErrors()) {
//            return "test";
//        } else {
//            studentService.save(student);
//            return "redirect:/dashboard";
//        }
//    }
}
