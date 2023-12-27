package com.encore.sb01web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;

@Controller // 보통 view를 반환하기 위해 사용
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) { // model객체로 데이터 저장
		
//		model.addAllAttributes("name", "강감찬");
		
		String name = "강감찬";
		model.addAttribute("name", name);
		
		return "home";
	}
}
