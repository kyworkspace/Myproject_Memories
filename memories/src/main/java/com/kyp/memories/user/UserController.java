package com.kyp.memories.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyp.memories.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login/login.go", method=RequestMethod.POST)
	public String goLogin() {
		return "login/login";
		
	}
	@RequestMapping(value = "/login/signUp.go", method=RequestMethod.POST)
	public String goSignUp() {
		
		return "login/signUp";
	}
	
	@RequestMapping(value = "/login/login.do", method=RequestMethod.POST)
	public String tryLogin() {
		
		
		
		return "login/signUp";
	}
	
	
	@RequestMapping(value="/login/signUp.do", method=RequestMethod.POST)
	public String trySignUp(HttpServletRequest req, HttpServletResponse res) {
		
		String Id =req.getParameter("userId");
		String email =  req.getParameter("email");
		String password = req.getParameter("password");
		String form = req.getParameter("signUpForm");
		
		
		System.out.println(form);
		System.out.println("Id : "+Id);
		System.out.println("email : "+ email);
		System.out.println("password : "+password);
		
		
		
		return "login/login";
	}
	
	
}
