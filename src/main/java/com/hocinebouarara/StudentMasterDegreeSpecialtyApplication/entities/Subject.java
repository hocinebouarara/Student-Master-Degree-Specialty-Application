package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "year")
    private String domain;

    @Column(name = "coefficient",nullable = true)
    private int coefficient;

    @Column(name = "credits",nullable = true)
    private int credits;

    @OneToMany(mappedBy = "subject")
    private List<StudentSubject> studentSubjects;

    @ManyToOne
    @JoinColumn(name = "specialty_id", nullable = true)
    private Specialty specialty;

    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = true)
    private Teacher teacher;

}

