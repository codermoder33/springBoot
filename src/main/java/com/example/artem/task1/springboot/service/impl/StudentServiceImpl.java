package com.example.artem.task1.springboot.service.impl;

import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.repository.StudentRepository;
import com.example.artem.task1.springboot.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    @Transactional
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public Optional<Student> findById(int id) { return repository.findById(id); }

    @Override
    @Transactional
    public Optional<Student> updateStudent(Student student) { return Optional.of(repository.save(student));}

    @Override
    @Transactional
    public boolean deleteStudent(int id) { return repository.deleteById(id); }
}

