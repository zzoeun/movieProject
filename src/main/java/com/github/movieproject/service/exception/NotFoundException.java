package com.github.movieproject.service.exception;

import com.github.movieproject.web.advice.ErrorCode;
import org.springframework.http.HttpStatus;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }

}
