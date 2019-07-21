package com.jsp.pkg2;

import java.util.*;

import javax.persistence.*;

@Entity
public class Details {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	
	private Date joinedDate;

	@ManyToMany
	@JoinTable(name="ManyToMany" , joinColumns=@JoinColumn(name="user_id"),
				inverseJoinColumns=@JoinColumn(name="vehicle_id"))
	
	Collection <Vehicle> vehicle=new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
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