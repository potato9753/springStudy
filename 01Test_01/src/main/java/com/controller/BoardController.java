package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.Board;
import com.service.DBService;

public class BoardController {

	@Autowired
	DBService service;
	
	@RequestMapping("/list")
	public String list(Model m) {
		System.out.println("list");
		
		List<Board> list = service.boardList();
		m.addAttribute("boardList",list);
		
		return "list";
	}
}
