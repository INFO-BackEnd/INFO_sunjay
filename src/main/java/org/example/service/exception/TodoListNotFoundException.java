package org.example.service.exception;

import org.example.global.error.exception.TodoListException;
import org.example.global.error.exception.ErrorCode;

public class TodoListNotFoundException extends TodoListException {
    public static TodoListNotFoundException EXCEPTION = new TodoListNotFoundException();

    private TodoListNotFoundException(){
        super(ErrorCode.TODO_NOT_FOUND);
    }
}
