package com.example.artem.task1.springboot.controller;

import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class FirstController {
    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> findAllStudents(){
       return service.findAllStudents();
    }

    @PostMapping("/save_Student")

    public void saveStudent(@RequestBody Student student){
       service.saveStudent(student);

    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return service.findByEmail(email);

    }
    @PostMapping("/update_Student")

    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);

    }
    @DeleteMapping("/delete_Student/{email}")

    public void updateStudent(@PathVariable String email){
        service.deleteStudent(email);
    }
}
