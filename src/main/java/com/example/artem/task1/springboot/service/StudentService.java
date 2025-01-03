package com.example.artem.task1.springboot.service;

import com.example.artem.task1.springboot.model.Student;

import java.util.List;

public interface StudentService {
   List<Student> getStudents();
   Student saveStudent(Student s);
   Student findById(int id);

   Student updateStudent(Student student);

   boolean deleteStudent(int id);

}
