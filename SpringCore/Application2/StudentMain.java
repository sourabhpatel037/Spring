package com.student.details;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		BeanFactory beanfactory=new FileSystemXmlApplicationContext("C:\\Users\\Sourabh Patel\\eclipse-workspace\\Spring2\\student.xml");
		
		Student s1=(Student) beanfactory.getBean("student1");
		System.out.println(" **********Student Details -1 ********");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getMobileNumber());
		System.out.println(s1.getAddress().getCity());
		System.out.println(s1.getAddress().getPinCode());
		System.out.println(s1.getAddress().getState());
		System.out.println(s1.getAddress().getCountry());
		
		System.out.println();
		
		Student s2=(Student) beanfactory.getBean("student2");
		System.out.println(" **********Student Details -2 ********");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getMobileNumber());
		System.out.println(s1.getAddress().getCity());
		System.out.println(s1.getAddress().getPinCode());
		System.out.println(s1.getAddress().getState());
		System.out.println(s1.getAddress().getCountry());
		
		System.out.println();
		
		Student s3=(Student) beanfactory.getBean("student3");
		System.out.println(" **********Student Details -3 ********");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getMobileNumber());
		System.out.println(s1.getAddress().getCity());
		System.out.println(s1.getAddress().getPinCode());
		System.out.println(s1.getAddress().getState());
		System.out.println(s1.getAddress().getCountry());
		
		System.out.println();
		
		Student s4=(Student) beanfactory.getBean("student4");
		System.out.println(" **********Student Details -4 ********");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getMobileNumber());
		System.out.println(s1.getAddress().getCity());
		System.out.println(s1.getAddress().getPinCode());
		System.out.println(s1.getAddress().getState());
		System.out.println(s1.getAddress().getCountry());
		
		System.out.println();
		
		Student s5=(Student) beanfactory.getBean("student5");
		System.out.println(" **********Student Details -5 ********");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getMobileNumber());
		System.out.println(s1.getAddress().getCity());
		System.out.println(s1.getAddress().getPinCode());
		System.out.println(s1.getAddress().getState());
		System.out.println(s1.getAddress().getCountry());
		
	}

}
