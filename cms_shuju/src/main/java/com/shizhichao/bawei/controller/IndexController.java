package com.shizhichao.bawei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shizhichao.bawei.service.UserService;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private UserService service;
	
	
	@RequestMapping("")
	public String index() {
		return "index";
		
	}
	
	
	
}
