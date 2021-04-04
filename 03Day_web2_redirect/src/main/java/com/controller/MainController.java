package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("main>>>>>");
		return "main";
	}
	
	//redirect
	@RequestMapping("/xxx")
	public String xxx(Model m) {
		System.out.println("xxx>>>>>");
		m.addAttribute("username", "홍길동");
		return "redirect:main";
	}
	
	@RequestMapping("/yyy")
	public String yyy(Model m) {
		System.out.println("yyy>>>>>");
		m.addAttribute("username", "홍길동");
		return "forward:main";
	}
}
