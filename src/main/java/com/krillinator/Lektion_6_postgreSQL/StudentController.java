package com.krillinator.Lektion_6_postgreSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;



    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(@RequestParam(required = false) final String studentName) {

        try {
            List<Student> studentList = new ArrayList<>();

            if (studentName == null) {
                studentList.addAll(studentRepository.findAll());
            } else {
                studentList.addAll(studentRepository.findByName(studentName));
            }

            if (studentList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(studentList, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody final Student student) {

        try {
            Student _student = studentRepository.save(new Student(student.getName()));

            return new ResponseEntity<>(_student, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }



}
