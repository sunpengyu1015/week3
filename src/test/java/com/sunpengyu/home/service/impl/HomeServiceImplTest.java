package com.sunpengyu.home.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.common.utils.DateUtil;
import com.bobo.common.utils.RandomUtil;
import com.bobo.common.utils.StringUtil;
import com.sunpengyu.home.domain.CreatedHome;
import com.sunpengyu.home.service.HomeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class HomeServiceImplTest {
	
	@Autowired
	private HomeService homeService;

	@Test
	public void testInsertHome() {
		List<CreatedHome> list = new ArrayList<CreatedHome>();
		for (int i = 0; i < 100; i++) {
			CreatedHome h = new CreatedHome();
			//生成预定日期
			Calendar c = Calendar.getInstance();
			c.set(2020, 4, 1);
			h.setCreated(DateUtil.random(c.getTime(), new Date()));
			//随即生成姓名
			h.setName(StringUtil.generateChineseName());
			//随即生成11位手机号
			h.setPhone(RandomUtil.random(11));
			//随即生成房型类型
			int[] home = {1,2};
			h.setHid(home[RandomUtil.random(0, 1)]);
			//随机生成备注
			h.setInfo(StringUtil.randomChineseString(20));
			list.add(h);
		}
		homeService.insertHome(list);
	}
	
	

}
