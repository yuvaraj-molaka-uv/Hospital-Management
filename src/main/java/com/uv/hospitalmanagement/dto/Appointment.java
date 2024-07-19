package com.uv.hospitalmanagement.dto;

//import javax.persistence.*;

import java.util.Date;

//@Entity
public class Appointment {
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
//    @ManyToOne
//    @JoinColumn(name = "patient_id")
    private Patient patient;
    
//    @ManyToOne
//    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
    
    private Date appointmentDate;
    private String status;

    // Getters and Setters
}