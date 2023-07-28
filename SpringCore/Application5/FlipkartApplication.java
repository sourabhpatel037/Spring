package com.flipkart.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.flipkart.orders.Orders;
import com.flipkart.orders.OrderManagement;
import com.flipkart.product.Product;

public class FlipkartApplication {

	public static void main(String[] args) {

		
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\Sourabh Patel\\eclipse-workspace\\spring_bean_wiring\\beans.xml");

		OrderManagement orderManagement = (OrderManagement) context.getBean("orderMgmt");
		Orders order = orderManagement.getOrder();
		System.out.println();
		
		Product product = order.getProduct();
		System.out.println();
		
		System.out.println("product-id= \t"+product.getProductId());
		System.out.println();
		
		System.out.println("product-Name= \t"  +product.getProductName());
		System.out.println();
		
		System.out.println("order-id= \t"  +order.getOrderId());
		System.out.println();
		
		System.out.println("get order value= \t"  +order.getOrderValue());
		System.out.println();
		
		System.out.println("get Number of orders =\t"  +orderManagement.getNoOfOrders());
		System.out.println();
		
		System.out.println("get Total amount= \t"  +orderManagement.getTotalAmount());
		System.out.println();
		
		System.out.println("get product Name=\t"  +orderManagement.getOrder().getProduct().getProductName());
		System.out.println();
		
		System.out.println("get order id=\t"  +orderManagement.getOrder().getOrderId());
		

	}

}
