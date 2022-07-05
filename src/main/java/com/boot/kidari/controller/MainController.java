package com.boot.kidari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.kidari.service.MainService;

@Controller
@RequestMapping(value = "/")
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping(value = "/test")
	public String testMtd(String param) {
		//mainService.testMtd(param);
		//return "redirect:/index.html";
		return "index";
	}
}
