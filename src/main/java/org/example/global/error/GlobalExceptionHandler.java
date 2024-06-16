package org.example.global.error;

import org.example.global.error.exception.ErrorCode;
import org.example.global.error.exception.TodoListException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TodoListException.class)
    public ResponseEntity<ErrorResponse> handleGlobal(TodoListException exception) {
        final ErrorCode errorCode = exception.getErrorCode();
        return new ResponseEntity<>(
                ErrorResponse.builder()
                        .statusCode(errorCode.getStatusCode())
                        .message(errorCode.getMessage())
                        .build(),
                HttpStatus.valueOf(errorCode.getStatusCode()));
    }
}
