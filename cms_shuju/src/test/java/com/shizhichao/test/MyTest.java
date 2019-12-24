package com.shizhichao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shizhichao.bawei.service.impl.CarServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MyTest {

	@Autowired
	private CarServiceImpl car;
	
	@Test
	public void show() {
		car.readFile();
	}
	
	@Test
	public void show1() {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
		String a="2019-01-20";
		try {
			Date parse = simpleDateFormat.parse(a);
			Calendar instance = Calendar.getInstance();
			instance.setTime(parse);
			System.out.println(instance.get(Calendar.DAY_OF_WEEK));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
