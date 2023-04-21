package com.rajat.mywebapp.utils;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class Excpetions extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    ResponseEntity<Object> handler(Exception ex, WebRequest request) throws Exception {
       ex.printStackTrace();
       return new ResponseEntity<>(ex.toString(), HttpStatus.BAD_GATEWAY);
   }
}
