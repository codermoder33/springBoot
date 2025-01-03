package com.example.artem.task1.springboot.service.studentServiceImpl;

import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.repository.StudentRepository;
import com.example.artem.task1.springboot.service.StudentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Student saveStudent(Student s) {
        return repository.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findAllEmail(email);
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);

    }
}
