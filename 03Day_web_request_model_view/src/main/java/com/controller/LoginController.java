package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.User;

@Controller
public class LoginController {
	
	// 뷰만 지정된 쳥태로서 return type이 String이면 JSP파일명을 의미한다.
	@RequestMapping(value = "/login" , method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm"; // /WEB-INF/views/loginForm.jsp
	}
	
	// jsp의 요청 파라미터 얻는 방법 1 - @RequestParam 사용
//		@RequestMapping(value = "/login" , method = RequestMethod.POST)
//		public String login(@RequestParam("userid") String userid, // 이전 requewst.getParameter("userid")와 동일
//				@RequestParam("passwd") String passwd) {
//			System.out.println(userid+"\t"+passwd);
//			return "login"; // /WEB-INF/views/login.jsp
//		}
	
	// jsp의 요청 파라미터 얻는 방법 2 - DTO 클래스
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String login(@ModelAttribute("xxx") User user) { // request.setAttribute("user",user)와 동일
		System.out.println(user);
		System.out.println(user.getUserid()+"\t"+user.getPasswd());
		return "login"; // /WEB-INF/views/login.jsp
	}
}
