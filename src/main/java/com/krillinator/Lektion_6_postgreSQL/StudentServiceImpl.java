package com.krillinator.Lektion_6_postgreSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public ResponseEntity<Student> getStudentId(long id) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Student>> getAllStudents(String studentName) {

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


    @Override
    public ResponseEntity<Student> saveStudent(Student student) {

        try {
            Student _student = studentRepository.save(new Student(student.getName()));

            return new ResponseEntity<>(_student, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @Override
    public ResponseEntity<Student> updateStudent(Student student) {

        return  new ResponseEntity<>(null, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Student> deleteStudent(long id) {

        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
