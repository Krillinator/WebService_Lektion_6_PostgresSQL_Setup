package com.krillinator.Lektion_6_postgreSQL;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    // TODO - Define methods
    ResponseEntity<Student> getStudentId(long id);                      // Get one
    ResponseEntity<List<Student>> getAllStudents(String studentName);   // Fetch ALL
    ResponseEntity<Student> saveStudent(Student student);               // Save
    ResponseEntity<Student> updateStudent(Student student);             // Update
    ResponseEntity<Student> deleteStudent(long id);                     // Delete


}




