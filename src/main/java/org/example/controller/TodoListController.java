/* package org.example.controller;

import org.example.controller.dto.request.TodoListCreateRequest;
import org.example.controller.dto.request.TodoListUpdateRequest;
import org.example.controller.dto.response.TodoListResponse;
import org.example.service.TodoListService;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TodoListController {
    private final TodoListService todoListService;

    @GetMapping
    public List<TodoListResponse> getAlltodoList(){
        return todoListService.getAlltodoList();
    }

    @GetMapping("{id}")
    public TodoListResponse getTodoListById(@PathVariable("id") int id){
        return todoListService.getTodoListById(id);
    }

    @PostMapping
    public void createTodoList(@RequestBody TodoListResponse todoListResponse){
        todoListService.createTodoList(todoListResponse);
    }

    @PutMapping("{id}")
    public void updateTodoList(@PathVariable("id") int id, @RequestBody TodoListUpdateRequest todoListUpdateRequest){
        todoListService.updateTodoList(id, todoListUpdateRequest);
    }
}
*/