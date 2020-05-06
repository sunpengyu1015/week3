package com.sunpengyu.home.VO;

import java.util.Date;

import com.sunpengyu.home.domain.CreatedHome;

public class CreatedHomeVO extends CreatedHome{

	private double p1;//房价1
	private double p2;//房价2
	
	private Date c1;//预定日期1
	private Date c2;//预定日期2
	public double getP1() {
		return this.p1;
	}
	public void setP1(double p1) {
		this.p1 = p1;
	}
	public double getP2() {
		return this.p2;
	}
	public void setP2(double p2) {
		this.p2 = p2;
	}
	public Date getC1() {
		return this.c1;
	}
	public void setC1(Date c1) {
		this.c1 = c1;
	}
	public Date getC2() {
		return this.c2;
	}
	public void setC2(Date c2) {
		this.c2 = c2;
	}
	
	
	

}
