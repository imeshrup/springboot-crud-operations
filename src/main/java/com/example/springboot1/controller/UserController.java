package com.example.springboot1.controller;

import com.example.springboot1.dto.UserDTO;
import com.example.springboot1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userservice;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser() {
        return userservice.getAllUsers();
}
    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userservice.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userservice.updateUser(userDTO);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userservice.deleteUser(userDTO);
    }
}
