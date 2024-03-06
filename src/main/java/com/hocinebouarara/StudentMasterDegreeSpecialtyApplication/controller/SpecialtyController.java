package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.controller;

import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Specialty;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities.Subject;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services.SpecialtyService;
import com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class SpecialtyController {

    private SubjectService subjectService;
    private  SpecialtyService specialtyService;

    @Autowired
    public SpecialtyController(SubjectService theSubjectService,SpecialtyService theSpecialtyService){
        subjectService = theSubjectService;
        specialtyService = theSpecialtyService;

    }

    // get the details of each specialty

    @GetMapping("/specialty/{specialtyId}")
    public String getSpecialtyInfo(@PathVariable("specialtyId") Long specialtyId, Model model) {
        // Get the selected specialty
        Specialty specialty = specialtyService.findById(specialtyId).get();
        model.addAttribute("specialty",specialty);

        if (specialty != null) {
            // Get all subjects for the selected specialty
            List<Subject> subjects = subjectService.findAllBySpecialty(specialty);

            // Add the subjects to the model
            model.addAttribute("subjects", subjects);

            return "specialty-info";

        }else {
            return "error";
        }
    }
}
