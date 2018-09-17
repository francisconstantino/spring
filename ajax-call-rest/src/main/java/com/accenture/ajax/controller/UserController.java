package com.accenture.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	//http://localhost:8080/getuserinformation
	@RequestMapping("/getuserinformation")
	public String getuserinfo() {
		return "userinfo";
	}
}
