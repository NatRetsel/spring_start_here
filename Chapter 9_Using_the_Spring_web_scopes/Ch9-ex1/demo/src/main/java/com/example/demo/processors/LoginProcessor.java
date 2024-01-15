package com.example.demo.processors;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String username; 
	private String password; 
	public boolean login() { 
		String username = this.getUsername(); 
		String password = this.getPassword(); 

		if ("natalie".equals(username) && "password".equals(password)) { 
			return true; 
		} else { 
			return false; 
		} 
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
