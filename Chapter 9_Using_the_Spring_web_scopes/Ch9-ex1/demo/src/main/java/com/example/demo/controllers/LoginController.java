package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.processors.LoginProcessor;


@Controller
public class LoginController {

    @Autowired
    private ApplicationContext context; 

    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/") 
    public String loginPost(
                            @RequestParam String username, 
                            @RequestParam String password, 
                            Model model 
                            ) {
        LoginProcessor loginProcessor = context.getBean(LoginProcessor.class);
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login(); 
        if (loggedIn) { 
        model.addAttribute("message", "You are now logged in."); 
        } else { 
        model.addAttribute("message", "Login failed!"); 
        } 
        return "login.html"; 
    }
}
