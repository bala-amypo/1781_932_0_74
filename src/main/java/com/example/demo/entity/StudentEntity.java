package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GenetratedValue;
import jakarta.persistence.GenetratedType;
import jakarta.persistence.Id;


@Entity
public class StudentEntity{
    @Id  
    @GenetratedValue(strategy=GenetratedType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private float cgpa;

}