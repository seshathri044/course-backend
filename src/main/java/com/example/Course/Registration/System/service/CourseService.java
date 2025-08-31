package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegister;
import com.example.Course.Registration.System.repository.CourseRegisterRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courserepo;
    @Autowired
    CourseRegisterRepo courseRegisterRepo;

    public List<Course> availableCourses() {
        return courserepo.findAll();
    }

    public List<CourseRegister> enrolledStudent() {
        return courseRegisterRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegister courseRegister = new CourseRegister(name,emailId,courseName);
        courseRegisterRepo.save(courseRegister);
    }
}
