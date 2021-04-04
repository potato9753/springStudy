package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.User;

@Controller
public class LoginController {

	@RequestMapping("/loginForm")
	public String loginForm() {
		System.out.println("login Form");
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute User user) {
		System.out.println("login");
		System.out.println(user);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	@RequestMapping("/login2")
	public String login2(@RequestParam("userid") String id, @RequestParam("passwd") String pw) {
		System.out.println("login");
		System.out.println(id + "\t" + pw);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	@RequestMapping("/login3")
	public String login3(@RequestParam String userid, @RequestParam String passwd) {
		System.out.println("login");
		System.out.println(userid + "\t" + passwd);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	@RequestMapping("/login4")
	public String login4(String userid, String passwd) {
		System.out.println("login");
		System.out.println(userid + "\t" + passwd);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	@RequestMapping("/login5")
	public String login5(@RequestParam Map<String, String> map) {
		System.out.println("login");
		System.out.println(map);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	@RequestMapping("/login6")
	public String login6(User user) {
		System.out.println("login");
		System.out.println(user);
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
}
