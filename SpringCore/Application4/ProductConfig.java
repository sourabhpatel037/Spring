package com.tek.teacher.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.teacher.Product;

@Configuration
public class ProductConfig {

	@Bean(name="mouse")
	public Product getProductInstance() {
		
		Product product = new Product();
		List<String> products = new ArrayList<>();
		product.setPrice(111.00);
		product.setProductId(123);
		product.setProductName("Remote");
		
		return product;
	}
	
	public void printData() {
		System.out.println("this is all about extra method");
	}
	
	public Product getProductInstanceTwo() {
		
		Product product = new Product();
		
		product.setPrice(2323.23);
		product.setProductId(2323);
		product.setProductName("KeyBoard");
		
		return product;
	}
}
