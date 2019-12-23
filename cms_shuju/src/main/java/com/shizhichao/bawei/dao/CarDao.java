package com.shizhichao.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.shizhichao.bawei.pojo.Car;

@Repository
public interface CarDao {


	void insert(@Param("list")List<Car> list);

}
