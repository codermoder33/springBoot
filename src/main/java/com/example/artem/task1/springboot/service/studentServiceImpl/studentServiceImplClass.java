package com.example.artem.task1.springboot.service.studentServiceImpl;

import com.example.artem.task1.springboot.dao.StudentDAO;
import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class studentServiceImplClass implements StudentService {
    @Autowired
    StudentDAO repository;
    @Override
    public List<Student> findAllStudents() {
       return repository.findAllStudents();

    }

    @Override
    public void saveStudent(Student s) {
        repository.saveStudent(s);

    }

    @Override
    public Student findByEmail(String email) {
       return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);

    }
}
