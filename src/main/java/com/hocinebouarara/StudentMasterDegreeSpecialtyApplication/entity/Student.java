package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "date_of_birth",nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "place_of_birth",nullable = false)
    private LocalDate placeOfBirth;

    @Column(name = "gender",nullable = false)
    private String gender;

    @Column(name = "registration_number",nullable = false)
    private String registrationNumber;

    @Column(name = "bac_registration_number",nullable = false)
    private String bacRegistrationNumber;

    @Column(name = "email",nullable = false, unique = true)
    private String email;

    @Column(name = "address",nullable = false)
    private String address;

    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "student")
    private List<StudentSubject> studentSubjects;

    @OneToMany(mappedBy = "student")
    private List<StudentChooseSpecialties> studentChooseSpecialties;

}

