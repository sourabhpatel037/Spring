package com.product;

public class ProductDetails {

	
	private String productName;
	private int price;
	private String productID;

	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void printProctdetails() {
		System.out.println("Prouct Details ");
		
	}
}
