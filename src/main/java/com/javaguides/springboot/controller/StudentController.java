package com.javaguides.springboot.controller;


import com.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    // 1. 단일 결과 값 반환
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


    // 2. 다수 결과 값 반환 -> list 사용
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




    // 3. path variable로 결과 값 반환
    // http://localhost:8080/students/1
    @GetMapping("students/{id}")
    public Student studentPathVariable(@PathVariable int id) {
        return new Student(id, "Jimin", "Yoo");
    }




    // 4. request param으로 결과 값 변환
    // http://localhost:8080/students/query?id=1
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id) {
        return new Student(id, "Jimin", "Yoo");
    }

}
