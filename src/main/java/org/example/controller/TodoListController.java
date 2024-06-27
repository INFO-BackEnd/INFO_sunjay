package org.example.controller;

import jakarta.validation.Valid;
import org.example.dto.request.TodoListCreateRequest;
import org.example.dto.request.TodoListUpdateRequest;
import org.example.dto.response.TodoListResponse;
import org.example.service.TodoListService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/todolist")
@RequiredArgsConstructor

public class TodoListController {
    private final TodoListService todoListService;

    @GetMapping
    public List<TodoListResponse> getAllTodoList() {
        return todoListService.getAllTodoList();
    }

    @GetMapping("{id}")
    public TodoListResponse getTodoListById(@PathVariable("id") Long id) throws IllegalAccessException {
        return todoListService.getTodoListById(id);
    }

    @PostMapping
    public void createTodoList(
            @RequestBody
            TodoListCreateRequest todoListCreateRequest
    ) {
        todoListService.createTodoList(todoListCreateRequest);
    }

    @PutMapping("{id}")
    public void updateTodoList(@PathVariable("id") Long id, @RequestBody TodoListUpdateRequest todoListUpdateRequest) throws IllegalAccessException {
        todoListService.updateTodoList(id, todoListUpdateRequest);
    }

    @DeleteMapping("{id}")
    public void deleteTodoList(@PathVariable("id") Long id) {
        todoListService.deleteTodoList(id);
    }
}