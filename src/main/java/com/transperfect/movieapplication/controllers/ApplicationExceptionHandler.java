package com.transperfect.movieapplication.controllers;

import com.transperfect.movieapplication.dtos.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.transperfect.movieapplication.Constant.ERROR_SYSTEM;

@RestControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseResponse> handleApiException(Exception e){
        return new ResponseEntity<>(new BaseResponse(false,ERROR_SYSTEM), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
