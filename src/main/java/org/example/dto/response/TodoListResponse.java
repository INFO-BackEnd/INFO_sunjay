package org.example.dto.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TodoListResponse {
    private Long id;
    private String content;
    private boolean completed;
}
