package com.javaguides.springboot.controller;


import com.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    // 1. 학생 정보를 단일 결과 값으로 반환
    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent() {

        // 예제 학생 정보 생성하고 반환
        Student student = new Student(
            1,
            "Jimin",
            "Yoo"
        );

        return student;
    }




    // 2. 학생 정보를 다수 결과 값으로 반환 -> list 사용
    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents() {

        // 예제 학생 정보 생성하고 반환
        List<Student> student = new ArrayList<>();
        student.add(new Student(1, "Jimin", "Yoo"));
        student.add(new Student(2, "Minjeong", "Kim"));
        student.add(new Student(3, "Yizhuo", "Ning"));
        student.add(new Student(4, "Aeri", "Uchinaga"));

        return student;
    }




    // 3. 학생 정보를 경로 변수(path variable)로 반환
    // http://localhost:8080/students/1
    @GetMapping("students/{id}")
    public Student studentPathVariable(@PathVariable int id) {

        // 학생 id를 경로변수로 받아 해당 학생 정보 반환
        return new Student(id, "Jimin", "Yoo");
    }




    // 4. 학생 정보를 요청 매개변수로 반환 -> request param
    // http://localhost:8080/students/query?id=1
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id) {

        // 학생 id를 요청 매개변수로 받아 해당 학생 정보 반환
        return new Student(id, "Jimin", "Yoo");
    }



    // 학생 정보를 생성하고 반환하는 post 요청 처리
    // http://localhost:8080/students/create
    // 요청 본문(body)에 json 형식의 학생 정보를 포함해야 함
    @PostMapping("students/create")
    public Student createStudent(@RequestBody Student student) {

        // 화면(클라이언트)에서 전송된 학생 정보를 처리하고 저장 또는 출력
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return student;
    }

}
