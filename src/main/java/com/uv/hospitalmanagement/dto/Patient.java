package com.uv.hospitalmanagement.dto;

//import javax.persistence.*;

import java.util.List;

//@Entity
public class Patient {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    
//    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
    
//    @OneToMany(mappedBy = "patient")
    private List<MedicalRecord> medicalRecords;

    // Getters and Setters
}