package com.sunpengyu.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sunpengyu.home.VO.CreatedHomeVO;
import com.sunpengyu.home.domain.CreatedHome;
import com.sunpengyu.home.domain.HomeType;
import com.sunpengyu.home.service.HomeService;

@Controller
public class HomeController {
	
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("createdhome")
	public String selects(Model model,CreatedHomeVO createdHomeVO,@RequestParam( defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "10")Integer pageSize) {
		
		PageInfo<CreatedHome> info = homeService.selects(createdHomeVO, pageNum, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("vo", createdHomeVO);
		return "createdhome";
	}
	
	
	@RequestMapping("add")
	public String add() {
		return "add";
	}
	
	@RequestMapping("queryHomeType")
	@ResponseBody
	public List<HomeType> queryHomeType(){
		List<HomeType> list = homeService.queryHomeType();
		return list;
	}
	
	
	@RequestMapping("addcreatedhome")
	public String addcreatedhome(CreatedHome createdHome) {
		homeService.addcreatedHome(createdHome);
		return "redirect:createdhome";
	}

}
