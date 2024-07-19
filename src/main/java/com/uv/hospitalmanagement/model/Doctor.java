package com.uv.hospitalmanagement.model;

//import javax.persistence.*;
import java.util.List;

//@Entity
public class Doctor {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    private String lastName;
    private String specialization;
    
//    @ManyToOne
//    @JoinColumn(name = "department_id")
    private Department department;
    
//    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    // Getters and Setters
}