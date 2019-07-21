package com.jsp.pkg2;

import javax.persistence.*;

@Table(name="Mydetails1")
@Entity
public class Details {
	
	@Id
	private int rollno;
	private String name;
	private int marks;

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}