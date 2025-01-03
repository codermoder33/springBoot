package com.example.artem.task1.springboot.repository;

import com.example.artem.task1.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public void deleteByEmail(String email);
    public Student findAllEmail(String email);
}
