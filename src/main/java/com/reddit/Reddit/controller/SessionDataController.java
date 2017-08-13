package com.reddit.Reddit.controller;

import com.reddit.Reddit.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SessionDataController {

    @RequestMapping(value = "/user/session")
    public String addToSession(HttpServletRequest request,
                               String attribute,
                               String value)
    {
        HttpSession session = request.getSession();
        session.setAttribute(attribute, value);
        return "redirect:/";
    }
}
