package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.User;

@Controller
public class MainController {

	@RequestMapping("/main")
	public User main() {
		User user = new User("홍길동", "1234");
		return user;
	}
	
	@RequestMapping("/main2")
	@ResponseBody
	public User main2() {
		User user = new User("홍길동", "1234");
		return user;
	}
	
	@RequestMapping("/main3")
	@ResponseBody
	public ArrayList<User> main3() {
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("홍길동1", "1234"));
		list.add(new User("홍길동2", "1234"));
		return list;
	}
	
}
