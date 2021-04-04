package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.User;

@Controller
public class TestController2 {
	
	/*
	 * 	Controller의 메서드 파라미터 변수 종류
	 */
	
	//1. String ==> jsp 파일명 의미, Model은 없고 View 정보만 제공, Model설정은 메서드의 파라미터로 설정 가능
	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("home");
		return "home";
	}

	//2. ModelAndView ==> jsp 파일명 의미, Model은 없고 View 정보만 제공
	@RequestMapping(value = "/home2")
	public ModelAndView home2() {
		System.out.println("home2");
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "홍길동"); // Model정보
		mav.setViewName("home"); // View정 보
		return mav;
	}
	
	//3. User ==> Model만 지정, View지정 안함
	@RequestMapping(value = "/home3")
	@ModelAttribute("xxx")
	public User home3() {
		System.out.println("home3");
		User u = new User("aaaa", "1234");
		return u;
	}
		
	//4. ArrayList ==>  Model만 지정, View지정 안함 ==> 뷰정보는  RequestMapping 값으로 처리
	@RequestMapping(value = "/home4")
	@ModelAttribute("xxx")
	public ArrayList<String> home4() {
		System.out.println("home4");
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		return list;
	}
	
	
			
}
