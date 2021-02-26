package com.example.SpringBootMasterClass2021.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = ApiRequestException.class)
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException apiRequestException) {
        CustomException customException =
                new CustomException(apiRequestException.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now(), apiRequestException);
        return new ResponseEntity<>(customException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleNotFoundException(NotFoundException notFoundException) {
        CustomException customException =
                new CustomException(notFoundException.getMessage(), HttpStatus.NOT_FOUND, ZonedDateTime.now(), notFoundException);
        return new ResponseEntity<>(customException, HttpStatus.BAD_REQUEST);
    }
}
