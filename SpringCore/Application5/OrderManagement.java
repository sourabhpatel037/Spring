package com.flipkart.orders;

public class OrderManagement {

	private int noOfOrders;
	private double totalAmount;
	private Orders order;

	public OrderManagement(int noOfOrders, double totalAmount, Orders order) {
		super();
		this.noOfOrders = noOfOrders;
		this.totalAmount = totalAmount;
		this.order = order;
	}

	public OrderManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNoOfOrders() {
		return noOfOrders;
	}

	public void setNoOfOrders(int noOfOrders) {
		this.noOfOrders = noOfOrders;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

}
