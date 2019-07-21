package com.jsp.pkg2;

import javax.persistence.*;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	private int vehicle_id;
	private String vehicle_name;
	
	@OneToOne
	@JoinColumn(name="userId")
	private Details details;
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
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