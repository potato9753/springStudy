package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.PerformVO;
import com.example.dto.Review;
import com.example.dto.UserVO;
import com.example.service.PerformService;
import com.example.service.ReviewService;
import com.example.service.UserService;

@Controller
public class ReviewController {

	@Autowired
	ReviewService service;
	
	@Autowired
	UserService user_service;
	
	// 리뷰 목록보기
	@RequestMapping("/review")
	public ModelAndView list() {
		List<Review> list = service.reviewList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("reviewlist", list); // Model
		mav.setViewName("review_list"); // View
		return mav;
	}
	
	// 리뷰 쓰기
	@PostMapping("/review_write")
	public String write(Review review, UserVO userVO, @RequestParam String card_id) {
		System.out.println("write");
		UserVO user = user_service.userLogin(userVO);
		review.setUser_id(userVO.getUser_id());
		review.setCard_id(card_id);
		int num = service.reviewWrite(review);
		return "redirect:review";
	}
	
	// 리뷰 삭제하기
	@GetMapping(value = "/review_delete")
	public String delete(@RequestParam String review_id) {
		int num = service.reviewDelete(review_id);
		return "redirect:review";
	}
	
	// 좋아요
	@GetMapping("/statusGoodcnt")
	public String statusgoodcnt(@RequestParam String review_id) {
		int num = service.statusGoodcnt(review_id);
		System.out.println("Good");
		return "redirect:review";
	}
	
	// 싫어요
	@GetMapping("/statusBadcnt")
	public String statusbadcnt(@RequestParam String review_id) {
		int num = service.statusBadcnt(review_id);
		System.out.println("Bad");
		return "redirect:review";
	}
}
