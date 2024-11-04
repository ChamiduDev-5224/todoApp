package com.example.todoApp.controller;

import com.example.todoApp.dto.UserDTO;
import com.example.todoApp.model.User;
import com.example.todoApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/signup")
        public List<UserDTO> signup() {
        return userService.getAllUsers();
    }

    @PostMapping("/register")
    public User userRegister(@RequestBody UserDTO userDTO) {
        return userService.userRegister(userDTO);
    }
}
