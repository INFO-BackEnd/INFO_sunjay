package org.example.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class TodoListUpdateRequest {
    @NotBlank(message = "할 일의 내용은 공백일 수 없습니다")
    private String content;
    private boolean complete;
}
