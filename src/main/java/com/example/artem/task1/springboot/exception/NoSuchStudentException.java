package com.example.artem.task1.springboot.exception;

public class NoSuchStudentException extends RuntimeException{
    public NoSuchStudentException(int id){
        super("There is no such student with id "+id);
    }
}
