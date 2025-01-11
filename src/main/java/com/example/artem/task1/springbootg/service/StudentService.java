package com.example.artem.task1.springbootg.service;

import com.example.artem.task1.springbootg.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getStudents();
    Student saveStudent(Student s);
    Optional<Student> findById(int id);

    Optional<Student> updateStudent(Student student);

    boolean deleteStudent(int id);

}
