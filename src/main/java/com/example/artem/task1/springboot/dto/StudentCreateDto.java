package com.example.artem.task1.springboot.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class StudentCreateDto {
    public String firstName;

    public String lastName;

    public LocalDate dateOfBirth;

    public String email;
}
