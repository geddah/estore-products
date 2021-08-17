package com.knockoff.product.core.controller.exceptionhandler;

import com.knockoff.product.core.controller.exception.RecordNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RecordNotFoundException.class)
    public final ResponseEntity<Object> handleRecordNotFound(RecordNotFoundException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

}
