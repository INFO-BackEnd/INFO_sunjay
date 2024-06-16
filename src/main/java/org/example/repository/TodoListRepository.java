package org.example.repository;

import org.example.model.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository <DB와 연결될 객체, 해당 객체의 id의 필드 타입>
@Repository
public interface TodoListRepository extends JpaRepository<TodoListEntity, Long> {
}
