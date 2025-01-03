package com.example.artem.task1.springboot.exeptions;

public class NoSuchStudentExeption extends RuntimeException{
    public NoSuchStudentExeption(){
        super("Нет такого студента");
    }

}
