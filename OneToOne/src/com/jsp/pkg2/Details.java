package com.jsp.pkg2;

import java.util.*;

import javax.persistence.*;

@Table(name="OneToOne")
@Entity
public class Details {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	
//	@OneToOne
//	private Vehicle vehicle;
	
	private Date joinedDate;

//	public Vehicle getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Vehicle vehicle) {
//		this.vehicle = vehicle;
//	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}