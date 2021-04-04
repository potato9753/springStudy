package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.User;

@Controller
public class MainController {
	
	@RequestMapping("/list")
	public ModelAndView list() {

		ModelAndView mav = new ModelAndView();
		
		//모델 저장
		mav.addObject("username", "홍길동"); // request.setAttribute(key,value) 동일
		mav.addObject("age", 10);
		
		//View 저장
		mav.setViewName("list"); // /WEB-INF/views/list.jsp
		
		return mav;
	}
	
	@RequestMapping("/list2")
	public ModelAndView list2() {

		ModelAndView mav = new ModelAndView();
		
		//모델 저장
		mav.addObject("xxx", new User("홍길동","1234"));
		
		//View 저장
		mav.setViewName("list2"); // /WEB-INF/views/list2.jsp
		
		return mav;
	}
	
	@RequestMapping("/list3")
	public ModelAndView list3() {

		ModelAndView mav = new ModelAndView();
		System.out.println("1111");
		//모델 저장
		List<User> list = Arrays.asList(new User("이순신","1111"),new User("이순신2","2222"),new User("이순신3","3333"));
		
		mav.addObject("xyz",list);
		
		//View 저장
		mav.setViewName("list3"); // /WEB-INF/views/list3.jsp
		
		return mav;
	}
}
