package com.sunpengyu.home.domain;

import java.io.Serializable;

public class HomeType implements Serializable{
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String homeType;
	private double homePrice;
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHomeType() {
		return this.homeType;
	}
	public void setHomeType(String homeType) {
		this.homeType = homeType;
	}
	public double getHomePrice() {
		return this.homePrice;
	}
	public void setHomePrice(double homePrice) {
		this.homePrice = homePrice;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.homePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((this.homeType == null) ? 0 : this.homeType.hashCode());
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HomeType other = (HomeType) obj;
		if (Double.doubleToLongBits(this.homePrice) != Double.doubleToLongBits(other.homePrice))
			return false;
		if (this.homeType == null) {
			if (other.homeType != null)
				return false;
		} else if (!this.homeType.equals(other.homeType))
			return false;
		if (this.id == null) {
			if (other.id != null)
				return false;
		} else if (!this.id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "HomeType [id=" + this.id + ", homeType=" + this.homeType + ", homePrice=" + this.homePrice + "]";
	}
	
	
}
