package com.accenture.login.resource.user;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.login.domain.User;

@Path("/userservice")
public class UserService {
	
	//localhost:8081/userservice
	@GET
	@Path("/getUsers")
	@Produces(MediaType.APPLICATION_JSON)
	public User getAllUsers() {
		User user = new User();
		user.setEmail("dfdf@mail");
		user.setFirstName("francis");
		user.setLastName("dfdf");
		user.setPassword("ererer");
		user.setUsername("sdfdf");
		return user;
	}
}
