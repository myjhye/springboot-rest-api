package com.javaguides.springboot.controller;


import com.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent() {

        Student student = new Student(
            1,
            "Jimin",
            "Yoo"
        );

        return student;
    }

}
