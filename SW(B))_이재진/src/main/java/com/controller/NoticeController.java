package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Notice;
import com.service.DBService;

@Controller
public class NoticeController {

	@Autowired
	DBService service;

	@GetMapping("/write")
	public String writeUI() {
		System.out.println("writeUI");
		return "writeForm";
	}

	@PostMapping("/write")
	public String write(Notice notice) {
		System.out.println("write");
		int no = service.noticeWrite(notice);

		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(Model m) {
		List<Notice> list = service.noticeList();
		m.addAttribute("noticeList", list); 
		return "list"; 
	}

	@RequestMapping("/retrieve") 
	@ModelAttribute("xyz")
	public Notice retrieve(@RequestParam("no") int kkk) {

		Notice notice = service.selectByNo(kkk);

		return notice; 
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Notice notice) {
		int no = service.noticeUpdate(notice);
		return "redirect:list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam int no) {

		int no1 = service.noticeDelete(no);

		return "redirect:list";
	}
}
