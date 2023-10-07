package com.javaguides.springboot.controller;


import com.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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


    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents() {

        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Jimin", "Yoo"));
        student.add(new Student(2, "Minjeong", "Kim"));
        student.add(new Student(3, "Yizhuo", "Ning"));
        student.add(new Student(4, "Aeri", "Uchinaga"));

        return student;
    }

}
