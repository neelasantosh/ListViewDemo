package com.example.listviewdemo2;

import java.io.Serializable;

public class Student implements Serializable
{
	int prn;
	String name;
	float marks;
	public Student(){}
	
	public Student(int prn, String name, float marks) {
		super();
		this.prn = prn;
		this.name = name;
		this.marks = marks;
	}
	
	public int getPrn() {
		return prn;
	}
	
	public String getName() {
		return name;
	}
	
	public float getMarks() {
		return marks;
	}
	
	public void setPrn(int prn) {
		this.prn = prn;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
