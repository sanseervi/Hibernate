package com.jsp.pkg2;

/*import javax.persistence.Column;*/
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	/*@Column(name="Home_Street")*/
	private String streetName;
	/*@Column(name="Home_City")*/
	private String city;
	
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
