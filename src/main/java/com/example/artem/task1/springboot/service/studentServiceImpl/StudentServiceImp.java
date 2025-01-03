package com.example.artem.task1.springboot.service.studentServiceImpl;

import com.example.artem.task1.springboot.exeptions.NoSuchStudentExeption;
import com.example.artem.task1.springboot.repository.StudentRepository;
import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Override
    public List<Student> getStudents() {
       return repository.getStudents();
    }

    @Override
    public Student saveStudent(Student s) {
        return repository.saveStudent(s);
    }

    @Override
    public Optional<Student> findById(int id) {
        return repository.findById(id);

    }

    @Override
    public Optional<Student> updateStudent(Student student) {
        return repository.updateStudent(student);

    }

    @Override
    public boolean deleteStudent(int id) {
        return repository.deleteStudent(id);

    }
}
