package com.shizhichao.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shizhichao.bawei.pojo.Car;
import com.shizhichao.bawei.service.CarService;
@RequestMapping("/car/")
@Controller

public class CarController {

	@Autowired
	public CarService carService;
	
	@RequestMapping("list")
	public String list(Car car,Model m,@RequestParam(defaultValue = "1") Integer pageNum) {
		
		PageHelper.startPage(pageNum, 3);
		
		List<Car> list=carService.list(car);
		
		PageInfo pageInfo = new PageInfo(list);
		
		m.addAttribute("pageInfo", pageInfo);
		m.addAttribute("list", list);
		m.addAttribute("car", car);
		
		
		return "/carr/list";
		
	}
	
	
}
