package com.shizhichao.test;

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
	
}
