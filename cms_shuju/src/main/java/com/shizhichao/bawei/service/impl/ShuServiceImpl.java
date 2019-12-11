package com.shizhichao.bawei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shizhichao.bawei.dao.ShuDao;
import com.shizhichao.bawei.service.ShuService;
@Transactional
@Service
public class ShuServiceImpl implements ShuService {

	@Autowired
	private ShuDao dao;
}
