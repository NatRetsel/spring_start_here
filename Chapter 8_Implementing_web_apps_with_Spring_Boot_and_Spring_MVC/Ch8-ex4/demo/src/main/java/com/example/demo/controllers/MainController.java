package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {
    @GetMapping("/home/{color}")
    public String index(@PathVariable String color,
                        Model page) {
        page.addAttribute("username", "katy");
        page.addAttribute("color", color);
        return "home.html";
    }
}
