package com.sky.users.UsersApplication.repository;

import com.sky.users.UsersApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> getUsersByName(String name);
}
