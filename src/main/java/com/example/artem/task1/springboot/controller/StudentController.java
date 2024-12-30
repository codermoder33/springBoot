package com.example.artem.task1.springboot.controller;

import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> index(){
        return service.findAllStudents();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
       return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student showStudentByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public void destroyStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
