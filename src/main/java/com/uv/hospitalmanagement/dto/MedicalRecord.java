package com.uv.hospitalmanagement.dto;

//import javax.persistence.*;

import java.util.Date;

//@Entity
public class MedicalRecord {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
//    @ManyToOne
//    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    private Date recordDate;
    private String diagnosis;
    private String treatment;

    // Getters and Setters
}