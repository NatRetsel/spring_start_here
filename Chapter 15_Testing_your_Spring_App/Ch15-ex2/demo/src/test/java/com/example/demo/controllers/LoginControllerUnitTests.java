package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import com.example.demo.processors.LoginProcessor;


@ExtendWith(MockitoExtension.class)
public class LoginControllerUnitTests {
    @Mock
    private Model model;

    @Mock
    private LoginProcessor loginProcessor;

    @InjectMocks
    private LoginController loginController;

    @Test
    public void loginPostLoginSucceedsTest() {
        when(loginProcessor.login()).thenReturn(true);
        String result = loginController.loginPost("username", "password", model);
        assertEquals("login.html", result);
        verify(model).addAttribute("message", "You are now logged in.");
    }

    @Test
    public void loginPostLoginFailsTest() {
        when(loginProcessor.login()).thenReturn(false);
        String result = loginController.loginPost("username", "password", model);
        assertEquals("login.html", result);
        verify(model).addAttribute("message", "Login failed!");
    }
}
