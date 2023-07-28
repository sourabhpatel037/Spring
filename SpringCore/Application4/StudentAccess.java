package com.tech.teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.tek.teacher.config.*;

public class StudentAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
        
        Student student3 = (Student) context.getBean("student");
        System.out.println(student3);
        
        Student student4 = (Student) context.getBean("student2");
        System.out.println(student4);
	}

}
