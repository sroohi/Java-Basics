package com.customer.info;

import org.springframework.core.annotation.Order;

public class CustomerInfo {
	private Integer customerId;
	private String firstName;
	private String lastName;
	private String email;
	private Order orderInfo;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Order getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(Order orderInfo) {
		this.orderInfo = orderInfo;
	}

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", orderInfo=" + orderInfo + "]";
	}

}
