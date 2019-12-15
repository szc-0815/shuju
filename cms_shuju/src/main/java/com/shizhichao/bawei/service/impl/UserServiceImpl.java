package com.shizhichao.bawei.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shizhichao.bawei.dao.ArticleDao;
import com.shizhichao.bawei.dao.UserDao;
import com.shizhichao.bawei.pojo.User;
import com.shizhichao.bawei.service.UserService;
@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return dao.selectByUsername(username);
	}

	@Override
	public boolean locked(Integer userId) {
		// TODO Auto-generated method stub
		return dao.updateLocked(userId,1)>0;
	}

	@Override
	public boolean unLocked(Integer userId) {
		// TODO Auto-generated method stub
		return dao.updateLocked(userId,0)>0;
	}

	@Override
	public int addScore(Integer userId, int score) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public PageInfo<User> getPageInfo(User user, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> userList = dao.select(user);
		return new PageInfo<>(userList);
	}
	
	
}
