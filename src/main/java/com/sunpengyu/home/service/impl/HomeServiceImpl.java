package com.sunpengyu.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunpengyu.home.VO.CreatedHomeVO;
import com.sunpengyu.home.dao.HomeDao;
import com.sunpengyu.home.domain.CreatedHome;
import com.sunpengyu.home.domain.HomeType;
import com.sunpengyu.home.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeDao homeDao;

	@Override
	public int insertHome(List<CreatedHome> list) {
		return homeDao.insertHome(list);
	}

	@Override
	public PageInfo<CreatedHome> selects(CreatedHomeVO createdHomeVO, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CreatedHome> list = homeDao.selects(createdHomeVO);
		PageInfo<CreatedHome> info = new PageInfo<CreatedHome>(list);
		return info;
	}

	@Override
	public List<HomeType> queryHomeType() {
		// TODO Auto-generated method stub
		return homeDao.queryHomeType();

	}

	@Override
	public void addcreatedHome(CreatedHome createdHome) {
		homeDao.addcreatedHome(createdHome);
	}

}
