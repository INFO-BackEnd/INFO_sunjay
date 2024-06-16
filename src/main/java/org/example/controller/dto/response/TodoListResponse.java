package org.example.controller.dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TodoListResponse {
    private int id;
    private String content;
    private boolean completed;
}
