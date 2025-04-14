package com.sky.users.UsersApplication.controller;

import com.sky.users.UsersApplication.entity.User;
import com.sky.users.UsersApplication.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        usersService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        User user = usersService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/users/name/{name}")
    public ResponseEntity<List<User>> getUsersByName(@PathVariable("name") String name) {
        List<User> users = usersService.getUsersByName(name);
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") Integer id) {
        usersService.deleteUserById(id);
        return ResponseEntity.ok().build();
    }


}
