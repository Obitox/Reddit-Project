package com.reddit.Reddit.controller;

import com.reddit.Reddit.model.User;
import com.reddit.Reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value="/allUsers")
    public List<User> allUsers(){
        return userRepository.getAllBy();
    }

}
