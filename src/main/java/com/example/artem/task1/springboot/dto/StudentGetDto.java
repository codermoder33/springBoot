package com.example.artem.task1.springboot.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class StudentGetDto {

    public Integer id;

    public String firstName;

    public String lastName;

    public LocalDate dateOfBirth;

    public String email;

    public int age;

}
