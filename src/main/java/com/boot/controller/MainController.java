/**
 * 
 */
package com.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.service.MainService;
import com.boot.vo.LectureVO;

/**

 * @FileName : MainController.java
 * @Date : 2022. 7. 9. 
 * @Author : jsh
 * @Description :
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@GetMapping("/mainPage")
	public String mainPage(String memberCode, Model model) {
		List<LectureVO> list = new ArrayList<LectureVO>();
		//list = 
		list = mainService.selectNowLectureInfo();
		System.out.println(list);
		model.addAttribute("lectureList", list);
		return "mainPage";
	}
}

