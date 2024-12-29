package com.example.artem.task1.springboot.service;

import com.example.artem.task1.springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
   public List<Student> findAllStudents();
   public void saveStudent(Student s);
   Student findByEmail(String email);

   Student updateStudent(Student student);

   void deleteStudent(String s);

}
