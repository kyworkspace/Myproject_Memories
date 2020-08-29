package com.kyp.memories.main;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyp.memories.VO.UserVO;
import com.kyp.memories.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login/login.go")
	public String goLogin() {
		return "login/login";
		
	}
	@RequestMapping(value = "/login/signUp.go")
	public String goSignUp() {
		
		return "login/signUp";
	}
	
	@RequestMapping(value = "/login/login.do")
	public String tryLogin() {
		
		return "login/signUp";
	}
	
	
	@RequestMapping(value="/login/signUp.do", method=RequestMethod.POST)
	public String trySignUp(HttpServletRequest req, HttpServletResponse res) {
		
		String Id =req.getParameter("userId");
		String email =  req.getParameter("email");
		String password = req.getParameter("password");
		String form = req.getParameter("signUpForm");
		
		
		UserVO userVO = new UserVO();
		userVO.setID(Id);
		userVO.setEMAIL(email);
		userVO.setPW(password);
		userVO.setNM(Id);
		
		System.out.println(form);
		System.out.println("Id : "+Id);
		System.out.println("email : "+ email);
		System.out.println("password : "+password);
		
		
		
		return "login/login";
	}

	@RequestMapping(value = "/login/accessDenied.do")
	public String accessDenied() {
		System.out.println("로그인 실패");
		return "login/signUp";
	}
}
