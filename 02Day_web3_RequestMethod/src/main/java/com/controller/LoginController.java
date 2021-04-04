package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.User;

@Controller
public class LoginController {

	@RequestMapping("/loginForm")
	public String loginForm() {
		System.out.println("login Form");
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	//@GetMapping
	//@RequestMapping(value = "/login", method = RequestMethod.GET)
	@GetMapping("/login")
	public String login(User user) {
		System.out.println("login:GET");
		System.out.println(user);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	//@PostMapping
	//@RequestMapping(value = "/login2", method = RequestMethod.POST)
	@PostMapping("/login2")
	public String login2(User user) {
		System.out.println("login:POST");
		System.out.println(user);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
}
