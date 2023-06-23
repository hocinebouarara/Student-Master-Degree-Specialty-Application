package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "position",nullable = false)
    private String position;

    @Column(name = "specialty",nullable = false)
    private String specialty;

    @Column(nullable = false)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "teacher")
    private List<StudentSubject> studentSubjects;

}

