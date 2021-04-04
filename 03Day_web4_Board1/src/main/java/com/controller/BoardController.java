package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.Board;
import com.service.DBService;

@Controller
public class BoardController {

	@Autowired
	DBService service;
	
	//글쓰기 화면 보기 - GET
	@GetMapping("/write")
	public String writeUI() {
		System.out.println("writeUI");
		return "write";
	}
	
	//글쓰기 - POST
	@PostMapping("/write")
	public String write(Board board) {
		System.out.println("write");
		int num = service.boardWrite(board);
		return "write";
	}
	
	
}
