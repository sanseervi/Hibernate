package com.jsp.pkg2;

import javax.persistence.*;

@Entity(name="nto1vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicle_id;
	private String vehicle_name;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private Details user;
	
//	Details user= new Details();
	
public Details getUser() {
		return user;
	}
	public void setUser(Details user) {
		this.user = user;
	}
	//	public Details getUser() {
//		return user;
//	}
//	public void setUser(Details user) {
//		this.user = user;
//	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
}