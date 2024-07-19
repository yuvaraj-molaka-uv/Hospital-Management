package com.uv.hospitalmanagement.dto;

//import javax.persistence.*;

import java.util.List;

//@Entity
public class Department {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
//    @OneToMany(mappedBy = "department")
    private List<Doctor> doctors;

    // Getters and Setters
}