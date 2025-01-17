package com.example.artem.task1.springboot.controller;

import com.example.artem.task1.springboot.dto.StudentGetDto;
import com.example.artem.task1.springboot.dto.StudentCreateDto;
import com.example.artem.task1.springboot.exception.NoSuchStudentException;
import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService service;

    @Autowired
    public StudentController(StudentService service){
        this.service=service;
    }

    @GetMapping
    public List<StudentGetDto> getStudents(){
        return service.getStudents();
    }

    @PostMapping
    public StudentGetDto createStudent(@RequestBody StudentCreateDto student){
        return service.saveStudent(student);
    }

    @GetMapping("/{id}")
    public StudentGetDto showStudentById(@PathVariable("id") int id){
        return service.findById(id)
                .orElseThrow(()->new NoSuchStudentException(id));
    }

    @PutMapping
    public StudentGetDto updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public boolean destroyStudent(@PathVariable("id") int id){
        return service.deleteStudent(id);
    }

}
