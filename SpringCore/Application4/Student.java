package com.tech.teacher;

public class Student {
  
	 private String studentName;
	 private int studentId;
	 private double markspercentage;
	 
	 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Student Object Created");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getMarkspercentage() {
		return markspercentage;
	}
	public void setMarkspercentage(double markspercentage) {
		this.markspercentage = markspercentage;
	}
	 
}
