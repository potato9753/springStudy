package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.User;

@RestController // @Controller + @ResponsBody
public class JSONController {
	
	@RequestMapping("/home")
	public User home() {
		User user = new User("홍길동", "1234");
		return user;
	}
	
	@RequestMapping("/home2")
	public ArrayList<User> home2() {
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("홍길동1", "1234"));
		list.add(new User("홍길동2", "1234"));
		return list;
	}
	
}
