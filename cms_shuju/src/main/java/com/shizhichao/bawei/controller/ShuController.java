package com.shizhichao.bawei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shizhichao.bawei.service.ShuService;

@Controller
public class ShuController {

	@Autowired
	private ShuService service;
}
