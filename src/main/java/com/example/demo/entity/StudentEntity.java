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

    public StudentEntity(long id,String name,String email,float cgpa){
        this.id=id
        this.ma
    }

    public void setName(String name){
        this.name=name;

    }
    public string getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email;
    }
    public void getEmail(){
        return this.email;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
}