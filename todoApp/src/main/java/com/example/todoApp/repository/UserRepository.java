package com.example.todoApp.repository;

import com.example.todoApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM User WHERE id=?1", nativeQuery=true)
    User getUserId(int id);
}
