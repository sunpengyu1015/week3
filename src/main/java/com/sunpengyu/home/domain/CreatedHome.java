package com.sunpengyu.home.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class CreatedHome implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger id;
	private Date created;// 预定时间
	private String name;// 姓名
	private String phone;// 手机
	private String info;// 备注
	private Integer hid;// 房间类型id
	private String homeType;// 房型
	private double homePrice;// 房屋价格

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getHid() {
		return this.hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
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
		result = prime * result + ((this.created == null) ? 0 : this.created.hashCode());
		result = prime * result + ((this.hid == null) ? 0 : this.hid.hashCode());
		long temp;
		temp = Double.doubleToLongBits(this.homePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((this.homeType == null) ? 0 : this.homeType.hashCode());
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.info == null) ? 0 : this.info.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
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
		CreatedHome other = (CreatedHome) obj;
		if (this.created == null) {
			if (other.created != null)
				return false;
		} else if (!this.created.equals(other.created))
			return false;
		if (this.hid == null) {
			if (other.hid != null)
				return false;
		} else if (!this.hid.equals(other.hid))
			return false;
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
		if (this.info == null) {
			if (other.info != null)
				return false;
		} else if (!this.info.equals(other.info))
			return false;
		if (this.name == null) {
			if (other.name != null)
				return false;
		} else if (!this.name.equals(other.name))
			return false;
		if (this.phone == null) {
			if (other.phone != null)
				return false;
		} else if (!this.phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreatedHome [id=" + this.id + ", created=" + this.created + ", name=" + this.name + ", phone="
				+ this.phone + ", info=" + this.info + ", hid=" + this.hid + ", homeType=" + this.homeType
				+ ", homePrice=" + this.homePrice + "]";
	}

}
