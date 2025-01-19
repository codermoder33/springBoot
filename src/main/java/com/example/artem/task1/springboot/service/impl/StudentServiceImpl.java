package com.example.artem.task1.springboot.service.impl;

import com.example.artem.task1.springboot.dto.StudentGetDto;
import com.example.artem.task1.springboot.dto.StudentCreateDto;
import com.example.artem.task1.springboot.mapper.StudentGetMapper;
import com.example.artem.task1.springboot.mapper.StudentCreateMapper;
import com.example.artem.task1.springboot.model.Student;
import com.example.artem.task1.springboot.repository.StudentRepository;
import com.example.artem.task1.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository){
        this.repository=repository;
    }

    @Override
    public List<StudentGetDto> getStudents() {
        return repository.findAll().stream()
                .map(StudentGetMapper.INSTANCE::toStudentGetDto)
                .toList();
    }

    @Override
    public StudentGetDto saveStudent(StudentCreateDto student) {
          return StudentGetMapper.INSTANCE.toStudentGetDto(
        repository.save(StudentCreateMapper.INSTANCE.toStudent(student)));
    }

    @Override
    public Optional<StudentGetDto> findById(int id) {
        return repository.findById(id).map(StudentGetMapper.INSTANCE::toStudentGetDto);
    }

    @Override
    public StudentGetDto updateStudent(Student student) {
        return StudentGetMapper.INSTANCE.toStudentGetDto(repository.save(student));
    }

    @Override
    public boolean deleteStudent(int id) {
        return repository.removeById(id)>0;

  }
}

