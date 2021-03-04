package com.example.SpringBootMasterClass2021.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

/* @Data generate Constructor, Getter, Setter, ToString, Equals and HashCode */
@Data
public class CustomException {
    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;
    private final Throwable throwable;
}
