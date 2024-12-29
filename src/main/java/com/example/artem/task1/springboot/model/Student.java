package com.example.artem.task1.springboot.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Builder
@Entity
public class Student {
    @Id
    @GeneratedValue
    int id;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    @Transient
    int age;
    @Column(unique = true)
    String email;
    public Student(){}
}
