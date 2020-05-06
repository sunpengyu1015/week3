package com.sunpengyu.home.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sunpengyu.home.VO.CreatedHomeVO;
import com.sunpengyu.home.domain.CreatedHome;
import com.sunpengyu.home.domain.HomeType;

public interface HomeDao {
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
	List<CreatedHome> selects(CreatedHomeVO createdHomeVO);

	
	
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
	 * @Description: 添加订单
	 * @param createdHome
	 * @return: void
	 */
	void addcreatedHome(@Param("c")CreatedHome createdHome);
}
