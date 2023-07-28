package com.tek.teacher.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tech.teacher.*;

@Configuration
public class StudentConfig {
 
	@Bean(name="student")
	public Student getStudent() {
		return new Student();
	}
	
	// 2nd Config for Student
	
	@Bean(name="student2")
	public Student getStudentSourav() {
		return new Student();
	}
	
}
