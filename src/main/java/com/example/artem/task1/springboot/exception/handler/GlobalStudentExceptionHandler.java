package com.example.artem.task1.springboot.exception.handler;

import com.example.artem.task1.springboot.exception.NoSuchStudentException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalStudentExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<String> handlerExeption(NoSuchStudentException n){
        return new ResponseEntity<>(n.getMessage(), HttpStatus.BAD_REQUEST);
    }
}