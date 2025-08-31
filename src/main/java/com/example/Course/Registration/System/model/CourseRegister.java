package com.example.Course.Registration.System.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "course_register")
@Getter
@Setter
public class CourseRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email_id")   // match DB column
    private String emailId;

    @Column(name = "course_name") // match DB column
    private String courseName;
    public CourseRegister(String name,String emailId,String courseName){
        this.name =name;
        this.emailId= emailId;
        this.courseName = courseName;
    }
    public CourseRegister(){
    }
}
