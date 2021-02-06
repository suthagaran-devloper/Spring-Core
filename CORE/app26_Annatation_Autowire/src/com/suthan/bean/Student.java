package com.suthan.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String sid;
	private String sname;
	private String saddr;
	
	private Course course;
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public Course getCourse() {
		return course;
	}
	@Autowired
	//@Required
	@Qualifier("spring")
	//@Qualifier("Hibernate")
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void getStudentDetails() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(saddr);
		System.out.println();
		
		
		System.out.println(course.getCid());
		System.out.println(course.getCname());
		System.out.println(course.getCcost());
		
		
	}
	
}
