package com.example.artem.task1.springboot.controller;

import com.example.artem.task1.springboot.exeptions.NoSuchStudentExeption;
import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        Optional<Student> o = service.findById(id);
        if(o.isPresent()) return o.get();
        throw new NoSuchStudentExeption();
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        Optional<Student> o = service.updateStudent(student);
        if(o.isPresent()) return o.get();
        throw new NoSuchStudentExeption();
    }

    @DeleteMapping("/{id}")
    public boolean destroyStudent(@PathVariable("id") int id){
        return service.deleteStudent(id);
    }

    @ExceptionHandler
    public ResponseEntity<String> handlerExeption(NoSuchStudentExeption n){
        return new ResponseEntity<>(n.getMessage(), HttpStatus.BAD_REQUEST);

    }
}
