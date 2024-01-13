package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/home")
    public String index(@RequestParam(required = false) String color,
                        @RequestParam(required = false) String name, 
                        Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }
}
