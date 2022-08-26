package com.example.crud.service;

import com.example.crud.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
    void editUser(User user);
}
