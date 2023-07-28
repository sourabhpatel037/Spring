package com.tech.teacher;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tek.teacher.config.ProductConfig;
import com.tek.teacher.config.StudentConfig;
public class ProductAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(StudentAccess.class);
		context.register(ProductAccess.class);
		
		context.refresh();
		
		Product product = (Product) context.getBean("mouse");
		
		System.out.println(product);
		System.out.println(product.getPrice());
		
		Student student = (Student) context.getBean("student");
		
		System.out.println(student);
	}

}
