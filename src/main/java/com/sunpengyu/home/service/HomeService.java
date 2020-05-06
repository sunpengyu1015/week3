package com.sunpengyu.home.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sunpengyu.home.VO.CreatedHomeVO;
import com.sunpengyu.home.domain.CreatedHome;
import com.sunpengyu.home.domain.HomeType;

public interface HomeService {
	
	/**
	 * 
	 * @Title: insertHome 
	 * @Description: 批量增加房间预订订单
	 * @param list
	 * @return
	 * @return: int
	 */
	int insertHome(List<CreatedHome> list);
	
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 列表查询
	 * @param createdHomeVO
	 * @return
	 * @return: List<CreatedHome>
	 */
	PageInfo<CreatedHome> selects(CreatedHomeVO createdHomeVO,Integer pageNum,Integer pageSize);

	/**
	 * 
	 * @Title: queryHomeType 
	 * @Description: 查询房屋类型
	 * @return
	 * @return: List<HomeType>
	 */
	List<HomeType> queryHomeType();

	/**
	 * 
	 * @Title: addcreatedHome 
	 * @Description: 添加酒店订单
	 * @param createdHome
	 * @return: void
	 */
	void addcreatedHome(CreatedHome createdHome);

}
