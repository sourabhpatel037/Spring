package com.product;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

	public static void main(String[] args) {
	
		BeanFactory factory = new FileSystemXmlApplicationContext("C:\\Users\\Sourabh Patel\\eclipse-workspace\\Spring2\\Beans.xml");


		System.out.println("Product1 Details *********");
		ProductDetails product = (ProductDetails) factory.getBean("product1");
		System.out.println(product.getProductName());
		System.out.println(product.getProductID());
		System.out.println(product.getPrice());
  
		System.out.println();
		
		System.out.println("Product2 Details *********");
		ProductDetails prod2 = (ProductDetails) factory.getBean("product2");
		System.out.println(prod2.getProductName());
		System.out.println(prod2.getProductID());
		System.out.println(prod2.getPrice());
		
		System.out.println();

		System.out.println("Order Details checking***********");

		OrderDetails order = (OrderDetails) factory.getBean("order1");
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderPrice());
		
		System.out.println();
		System.out.println(order.getItems());

	}

}
