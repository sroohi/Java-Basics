package com.order.info;

import java.util.Date;

public class OrderInfo {
	private Integer orderId;
	private String productName;
	private Date ordDate;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getOrdDate() {
		return ordDate;
	}

	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}

	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", productName=" + productName + ", ordDate=" + ordDate + "]";
	}

}
