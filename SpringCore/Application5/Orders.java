package com.flipkart.orders;

import com.flipkart.product.Product;

public class Orders {

	private String orderId;
	private double orderValue;
	private Product product;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(String orderId, double orderValue, Product product) {
		super();
		this.orderId = orderId;
		this.orderValue = orderValue;
		this.product = product;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
