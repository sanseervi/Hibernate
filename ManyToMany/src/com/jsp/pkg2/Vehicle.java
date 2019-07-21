package com.jsp.pkg2;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicle_id;
	private String vehicle_name;
	@ManyToMany(mappedBy="vehicle")
	Collection<Details> user=new ArrayList<Details>();
	public Collection<Details> getUser() {
		return user;
	}
	public void setUser(Collection<Details> user) {
		this.user = user;
	}
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