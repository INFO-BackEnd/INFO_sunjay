//DB와 상호 작용할 때 사용되는 기본 데이터 구조 정의
package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Getter
@Entity(name = "tbl_todolist")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "completed", nullable = false)
    private  Boolean completed;

    public void complete() {
        this.completed = true;
    }
    public void incomplete(){
        this.completed = false;
    }
}