package com.example.artem.task1.springboot.controller;

import com.example.artem.task1.springboot.exeptions.NoSuchStudentExeption;
import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
       return service.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Student showStudentById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public boolean destroyStudent(@PathVariable("id") int id){
        return service.deleteStudent(id);
    }
}