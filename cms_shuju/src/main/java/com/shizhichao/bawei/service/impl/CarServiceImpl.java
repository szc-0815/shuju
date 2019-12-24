package com.shizhichao.bawei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shizhichao.bawei.dao.CarDao;
import com.shizhichao.bawei.pojo.Car;
import com.shizhichao.bawei.service.CarService;
import com.shizhichao.utils.FileUtil;
import com.shizhichao.utils.GeoUtils;

@Transactional
@Service
public class CarServiceImpl implements CarService{

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
				car.setJingdu((double) Integer.parseInt(split[3]));
				car.setWeidu((double) Integer.parseInt(split[4]));
				
				list.add(car);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				continue;
			}
			
		}
		
		carDao.insert(list);
		
		
		return list;
		
		
		
		
		
	}


	@Override
	public List<Car> list(Car car) {
		List<Car> list=carDao.list(car);
		if(car.getJingdu()!=null && car.getWeidu()!=null) {
			for (Car car2 : list) {
				Double distance = GeoUtils.getDistance(car2.getJingdu(), car2.getWeidu(), car.getJingdu(), car.getWeidu());
				car2.setJuli(distance);
			}
		}
		
		
		
		return list;
	}


	
	
}
