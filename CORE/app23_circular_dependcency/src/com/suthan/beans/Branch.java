package com.suthan.beans;

public class Branch {

	private Student student;
	
	
	/*
	public Branch(Student student) {
		this.student = student;
	} */
	
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public String getBrancName()
	{
		return "computers";
	}
	
}
