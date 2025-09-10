package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegister;
import com.example.Course.Registration.System.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(
    origins = {
        "http://localhost:5500",
        "http://127.0.0.1:5500",
        "https://course-register-system.netlify.app"
    },
    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}
)
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegister> enrolledStudent() {
        return courseService.enrolledStudent();
    }

    @PostMapping("/courses/register")
    public String enrolledCourse(
            @RequestParam("name") String name,
            @RequestParam("emailId") String emailId,
            @RequestParam("courseName") String courseName) {
        courseService.enrollCourse(name, emailId, courseName);
        return "Congratulation! " + name + " Enrollment Successful for " + courseName;
    }
}
