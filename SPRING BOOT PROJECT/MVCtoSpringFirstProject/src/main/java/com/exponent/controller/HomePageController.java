package com.exponent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exponent.Entity.Employee;
import com.exponent.Service.HomeService;

@Controller
public class HomePageController {
	
	@Autowired
	private HomeService hs;
	
	@RequestMapping("/welcome")
	public String getMsg() {
		
		return "index";
	}

	@RequestMapping("/reg")
	public String getRegisterDate(@ModelAttribute Employee emp) {
		
		System.out.println(emp);
		
		hs.registerEmployeeinService(emp);
		return "index";
		
	}
}
