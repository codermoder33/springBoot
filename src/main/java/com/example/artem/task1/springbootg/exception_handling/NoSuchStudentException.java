package com.example.artem.task1.springbootg.exception_handling;

public class NoSuchStudentException extends RuntimeException{
    public NoSuchStudentException(int id){
        super("Студента с id "+id+" не существует.");
    }
}
