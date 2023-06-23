package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "specialties")
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialty_id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "available_places",nullable = false)
    private int availablePlaces;

    @OneToMany(mappedBy = "specialty")
    private List<StudentChooseSpecialties> studentChooseSpecialties;


}

