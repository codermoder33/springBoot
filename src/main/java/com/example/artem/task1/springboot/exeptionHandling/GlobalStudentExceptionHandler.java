package com.example.artem.task1.springboot.exeptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalStudentExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<String> handlerExeption(NoSuchStudentExeption n){
        return new ResponseEntity<>(n.getMessage(), HttpStatus.BAD_REQUEST);

    }


}
