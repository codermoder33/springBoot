package com.example.artem.task1.springboot.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Setter
@Getter
@Entity
public class Student {
    @Id
    @GeneratedValue
    public Integer id;

    @Column
    public String firstName;

    @Column
    public String lastName;

    @Column
    public LocalDate dateOfBirth;

    @Transient
    public int age;

    @Column(unique = true)
    public String email;

    public Student(){}

    public Student(String firstName, String email, int age){
        this.firstName=firstName;
        this.email=email;
        this.age=age;

    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
