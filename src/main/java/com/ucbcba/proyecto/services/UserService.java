package com.ucbcba.proyecto.services;

import com.ucbcba.proyecto.entities.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findUserByEmail(String email);
    void saveUserEdited(User user);
    User findByUsername(String username);
    List<User> listAll();

}