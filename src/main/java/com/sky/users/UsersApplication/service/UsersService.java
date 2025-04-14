package com.sky.users.UsersApplication.service;

import com.sky.users.UsersApplication.entity.User;
import com.sky.users.UsersApplication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public void createUser(User user){
        usersRepository.save(user);
    }

    public User getUserById(Integer id) {
        return usersRepository.getById(id);
    }

    public void deleteUserById(Integer id) {
        usersRepository.getById(id);
    }

    public List<User> getUsersByName(String name) {
        return usersRepository.getUsersByName(name);
    }

}
