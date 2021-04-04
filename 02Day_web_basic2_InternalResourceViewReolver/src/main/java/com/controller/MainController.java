package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	// http://localhost:9000/app/xyz
	@RequestMapping("/xyz")
	public String method() {
		System.out.println("MainController.method");
		return "hello";
	}
	@RequestMapping("/xyz2")
	public String method2() {
		System.out.println("MainController.method");
		return "hello";
	}
	
}
