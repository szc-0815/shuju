package com.shizhichao.bawei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shizhichao.bawei.dao.CarDao;
import com.shizhichao.bawei.pojo.Car;
import com.shizhichao.utils.FileUtil;

@Transactional
@Service
public class CarServiceImpl {

	@Autowired
	private CarDao carDao;
	
	
	public List<Car> readFile(){
		
		List<Car> list = new ArrayList<Car>();
		
		List<String> readTextFileOfList = FileUtil.readTextFileOfList("C:\\Users\\VULCAN\\Desktop\\car.txt");
		
		for (String read : readTextFileOfList) {
			System.out.println(read);
			try {
				String[] split = read.split(",");
				Car car = new Car();
				car.setShijian(split[0]);
				car.setChepai(split[1]);
				car.setChexing(split[2]);
				car.setJingdu(Integer.parseInt(split[3]));
				car.setWeidu(Integer.parseInt(split[4]));
				
				list.add(car);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				continue;
			}
			
		}
		
		carDao.insert(list);
		
		
		return list;
		
		
		
		
		
	}
	
}
