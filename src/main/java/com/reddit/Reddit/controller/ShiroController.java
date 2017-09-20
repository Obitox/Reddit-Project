package com.reddit.Reddit.controller;

import com.reddit.Reddit.repository.UserRepository;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShiroController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    @Autowired
    public ShiroController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @RequestMapping({"http://localhost:4200"})
    public String index() {
        return "http://localhost:4200";
    }

    @RequestMapping({"http://localhost:4200/new"})
    public String test(){
        return "http://localhost:4200/new";
    }

    @RequestMapping("/login")
    public String login(String username, String password) {
        Subject currentUser = SecurityUtils.getSubject();
        if (userRepository.existsByUsernameAndPassword(username, password)) {
            try {
                currentUser.login(new UsernamePasswordToken(username, password));
            } catch (Exception e) {
                logger.error(e.getLocalizedMessage(), e);
                return "test";
            }
            return "redirect:index";
        } else {
            return "index";
        }
    }

    @RequestMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "redirect:index";
    }
}
