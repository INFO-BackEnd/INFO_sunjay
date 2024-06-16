package org.example.service;

import org.example.controller.dto.response.TodoListResponse;
import org.example.repository.TodoListRepository;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoListService {

    private final TodoListRepository repo;

    public List<TodoListResponse> getALllTodoList(){
        return null;
    }
}
