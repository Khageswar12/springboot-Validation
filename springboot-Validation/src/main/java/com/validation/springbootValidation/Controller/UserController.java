package com.validation.springbootValidation.Controller;

import com.validation.springbootValidation.Model.User;
import com.validation.springbootValidation.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("users")
    public ResponseEntity<User>createUser(@Valid @RequestBody User user){
    User saveedUser =userService.createUser(user);
    return new ResponseEntity<User>(saveedUser, HttpStatus.CREATED);
    }
}
