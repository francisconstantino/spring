package com.accenture.login;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.accenture.login.resource.user.UserService;

@Configuration
public class LoginConfig extends ResourceConfig{

	public LoginConfig() {
		register(UserService.class);
	}
}
