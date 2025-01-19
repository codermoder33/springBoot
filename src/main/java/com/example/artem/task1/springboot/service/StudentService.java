package com.example.artem.task1.springboot.service;
import com.example.artem.task1.springboot.dto.StudentGetDto;
import com.example.artem.task1.springboot.dto.StudentCreateDto;
import com.example.artem.task1.springboot.model.Student;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentGetDto> getStudents();

    StudentGetDto saveStudent(StudentCreateDto s);

    Optional<StudentGetDto> findById(int id);

    StudentGetDto updateStudent(Student student);

    boolean deleteStudent(int id);
}
