package com.example.artem.task1.springbootg.repository;

import com.example.artem.task1.springbootg.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    boolean deleteById(int id);
}
