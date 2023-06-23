package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_subjects")
public class StudentSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Column(name = "note_of_TD",nullable = false)
    private double noteTD;

    @Column(name = "note_of_TP",nullable = false)
    private double noteTP;

    @Column(name = "note_of_Exam",nullable = false)
    private double noteExam;
}

