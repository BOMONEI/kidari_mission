package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping("/test")
	//@ResponseBody
	public String testMtd(String param) {
		//return param;
		//return "redirect:/index.html";
		return "test";
	}
}
