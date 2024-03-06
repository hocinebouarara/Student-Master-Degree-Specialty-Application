package com.hocinebouarara.StudentMasterDegreeSpecialtyApplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "master_branches")
public class MasterBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    private long id;

    @Column(name = "title",unique = true)
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "branch")
    private List<Specialty> specialties;



}
