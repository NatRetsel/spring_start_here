package com.example.demo.processors;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.example.demo.service.LoggedUserManagementService;
import com.example.demo.service.LoginCountService;

@Component
@RequestScope
public class LoginProcessor {
    private LoggedUserManagementService loggedUserManagementService;
    private LoginCountService loginCountService;
    private String username; 
	private String password; 

    public LoginProcessor (LoggedUserManagementService loggedUserManagementService,
                            LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

	public boolean login() { 
        loginCountService.increment();
		String username = this.getUsername(); 
		String password = this.getPassword(); 
        boolean loggedResult = false;
		if ("natalie".equals(username) && "password".equals(password)) { 
			loggedResult = true; 
            loggedUserManagementService.setUsername(username);
            
		} 
        return loggedResult; 
	}
    public String getUsername(){
        return this.username;
    } 
    public String getPassword(){
        return this.password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
