package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.request.TodoListCreateRequest;
import org.example.dto.request.TodoListUpdateRequest;
import org.example.dto.response.TodoListResponse;
import org.example.model.TodoListEntity;
import org.example.repository.TodoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoListService {

    private final TodoListRepository repo;

    public List<TodoListResponse> getAllTodoList() {
        List<TodoListEntity> todoList = repo.findAll();

        return todoList.stream().map(todo -> TodoListResponse.builder()
                .id(todo.getId())
                .content(todo.getContent())
                .completed(todo.getCompleted())
                .build()).toList();
    }

    public TodoListResponse getTodoListById(Long id) throws IllegalAccessException {
        Optional<TodoListEntity> optionalTodoListEntity = repo.findById(id);
        if (optionalTodoListEntity.isEmpty()) {
            throw new IllegalAccessException();
        }
        return TodoListResponse.builder()
                .id(optionalTodoListEntity.get().getId())
                .content(optionalTodoListEntity.get().getContent())
                .completed(optionalTodoListEntity.get().getCompleted())
                .build();
    }

    public void createTodoList(TodoListCreateRequest todoListCreateRequest) {
        TodoListEntity todoListEntity = TodoListEntity.builder()
                .content(todoListCreateRequest.getContent())
                .completed(todoListCreateRequest.isCompleted())
                .build();
        repo.save(todoListEntity);
    }

    public void updateTodoList(Long id, TodoListUpdateRequest todoListUpdateRequest) throws IllegalAccessException {
        Optional<TodoListEntity> optionalTodoListEntity = repo.findById(id);
        if (optionalTodoListEntity.isEmpty()) {
            throw new IllegalAccessException();
        }

        TodoListEntity todoListEntity = optionalTodoListEntity.get();
        if (todoListUpdateRequest.isComplete()) {
            todoListEntity.complete();
        } else {
            todoListEntity.incomplete();
        }
        repo.save(todoListEntity);
    }

    public void deleteTodoList(Long id) {
        repo.deleteById(id);
    }
}