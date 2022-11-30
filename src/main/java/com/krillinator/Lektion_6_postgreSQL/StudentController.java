package com.krillinator.Lektion_6_postgreSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentServiceImpl studentService;

    @Autowired
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(@RequestParam(required = false) final String studentName) {

        return studentService.getAllStudents(studentName);
    }


    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody final Student student) {

        return studentService.saveStudent(student);
    }



}
