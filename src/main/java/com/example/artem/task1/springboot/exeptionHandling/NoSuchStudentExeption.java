package com.example.artem.task1.springboot.exeptionHandling;

public class NoSuchStudentExeption extends RuntimeException{
    public NoSuchStudentExeption(){
        super("Нет такого студента");
    }

}
