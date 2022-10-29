package com.example.simple_crud.service;


import com.example.simple_crud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User save(User user);

    User update(Long id, User user);

    void delete(Long id);

    List<User> getAllUsers();

}
