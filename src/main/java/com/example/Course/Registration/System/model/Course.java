package com.example.Course.Registration.System.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "course_id")
    private String courseId;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "instructor")
    private String instructor;
    @Column(name = "duration")
    private int duration;
    public Course(){

    }
}
