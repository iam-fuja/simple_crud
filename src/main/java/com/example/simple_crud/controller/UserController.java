package com.example.simple_crud.controller;

import com.example.simple_crud.model.User;
import com.example.simple_crud.service.UserService;
import com.example.simple_crud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/save")
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping("/{id}")
    public ResponseEntity<User> editUser(@PathVariable Long id, @RequestBody User user){
        return ResponseEntity.ok().body(userService.update(id, user));
    }



}
