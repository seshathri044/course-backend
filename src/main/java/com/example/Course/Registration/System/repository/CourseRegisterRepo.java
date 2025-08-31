package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.CourseRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegisterRepo extends JpaRepository<CourseRegister,Integer> {

}
