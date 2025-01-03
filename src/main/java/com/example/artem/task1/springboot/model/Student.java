package com.example.artem.task1.springboot.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

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

    @Column(unique = true)
    public String email;

    public Student(){}

    public Student(String firstName, String email){
        this.firstName=firstName;
        this.email=email;
    }
    public Student(int id, String firstName, String email){
        this.id=id;
        this.firstName=firstName;
        this.email=email;

    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

