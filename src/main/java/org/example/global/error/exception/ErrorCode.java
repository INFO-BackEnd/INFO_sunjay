package org.example.global.error.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {
    TODO_NOT_FOUND(404, "TodoList Not Found"),

    INTERNAL_SERVER_ERROR(500, "Internal server error");
    private final int statusCode;
    private final String message;
}