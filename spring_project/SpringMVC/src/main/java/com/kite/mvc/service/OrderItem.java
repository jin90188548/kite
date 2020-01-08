package com.kite.mvc.service;

public class OrderItem {

	private String itemId;
	private String number;
	private String remark;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "OrderItem [itemId=" + itemId + ", number=" + number + ", remark=" + remark + "]";
	}

}
