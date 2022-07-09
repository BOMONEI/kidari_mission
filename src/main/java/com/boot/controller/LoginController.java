package com.boot.controller;

import java.util.Base64;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.service.LoginService;

@Controller
@RequestMapping(value = "/")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/loginAction") // 로그인 처리는 POST 형태로 Request
	@ResponseBody
	public boolean loginAction(String memberCode, HttpSession session) {
		int userFlag = loginService.getMemberFlag(memberCode);
		if(userFlag > 0) {
			session.setAttribute("memberCode", memberCode);
			session.setMaxInactiveInterval(1200); // 20분 session 유지 
			return true; 
		} else {
			return false;
		}
	}
	
	@GetMapping("/logout")
	public String userLogout(HttpSession session) {
		session.invalidate(); // 유저 세션정보 삭제 
		return "redirect: /login";
	}
}
