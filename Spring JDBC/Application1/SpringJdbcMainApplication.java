package com.naresh.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcMainApplication {

	public static void main(String[] args) {

			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.naresh.*");
			context.refresh();
			
			DbOperations dbOperations = context.getBean(DbOperations.class);
			int noOfRowsInserted = dbOperations.addspringdb();
			System.out.println("Rows Inserted: "+noOfRowsInserted);
			
			int noOfRowsDeleted = dbOperations.deletespringdb();
			System.out.println("Rows Deleted: "+noOfRowsDeleted);
			
			
	}

}
