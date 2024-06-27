package org.example.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;


@Validated
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class TodoListCreateRequest {
    @NotBlank(message = "할 일의 내용은 공백일 수 없습니다")
    private String content;
    private boolean completed;
}