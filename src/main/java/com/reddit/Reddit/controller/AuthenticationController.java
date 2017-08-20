package com.reddit.Reddit.controller;

import com.reddit.Reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    private UserRepository userRepository;

    @Autowired
    public AuthenticationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/log/userLogin/{username}/{password}")
    @ResponseBody
    public boolean logIN(@PathVariable("username") String username, @PathVariable("password") String password){
        return userRepository.existsByUsernameAndPassword(username, password);
    }
}
