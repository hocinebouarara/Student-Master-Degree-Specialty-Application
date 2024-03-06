package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @NotNull(message = "Document type can not be null!!")
    @Column(name = "document_type",nullable = false)
    private String documentType;

    @NotNull(message = "Document number can not be null!!")
    @NotEmpty(message = "Document number can not be empty!!")
    @Column(name = "document_number",nullable = false)
    private String documentNumber;

    @NotNull(message = "FirstName can not be null!!")
    @NotEmpty(message = "FirstName can not be empty!!")
    @Column(name = "first_name",nullable = false)
    private String firstName;

    @NotNull(message = "LastName can not be null!!")
    @NotEmpty(message = "LastName can not be empty!!")
    @Column(name = "last_name",nullable = false)
    private String lastName;

    @NotNull(message = "Gender can not be null!!")
    @Column(name = "gender",nullable = false)
    private String gender;

    @NotNull(message = "Birth date can not be null!!")
    @Column(name = "date_of_birth",nullable = false)
    private LocalDate dateOfBirth;

    @NotNull(message = "Birth place can not be null!!")
    @NotEmpty(message = "Birth place can not be empty!!")
    @Column(name = "place_of_birth",nullable = false)
    private String placeOfBirth;

    @NotNull(message = "Nationality can not be null!!")
    @NotEmpty(message = "Nationality can not be empty!!")
    @Column(name = "nationality",nullable = false)
    private String nationality;

    @NotNull(message = "Birth country can not be null!!")
    @NotEmpty(message = "Birth country can not be empty!!")
    @Column(name = "country_of_birth",nullable = false)
    private String countryOfBirth;

    @NotNull(message = "Address can not be null!!")
    @NotEmpty(message = "Address can not be empty!!")
    @Column(name = "address",nullable = false)
    private String address;

    @NotNull(message = "Email can not be null!!")
    @NotEmpty(message = "Email can not be empty!!")
    @Pattern(regexp = "")
    @Column(name = "email",nullable = false, unique = true)
    private String email;

    @NotNull(message = "Phone number can not be null!!")
    @NotEmpty(message = "Phone number can not be empty!!")
    @Column(name = "phone_number",nullable = false)
    private String phoneNumber;

    @Column(name = "registration_number",nullable = false,unique = true)
    private String registrationNumber;

    @NotNull(message = "Bac number can not be null!!")
    @NotEmpty(message = "Bac number can not be empty!!")
    @Column(name = "bac_number",nullable = true)
    private String bacNumber;

    @NotNull(message = "Bac year can not be null!!")
    @NotEmpty(message = "Bac year can not be empty!!")
    @Column(name = "bac_year",nullable = true)
    private String bacYear;

    @OneToMany(mappedBy = "student")
    private List<StudentSubject> studentSubjects;

    @OneToMany(mappedBy = "student")
    private List<StudentChooseSpecialties> studentChooseSpecialties;

}

