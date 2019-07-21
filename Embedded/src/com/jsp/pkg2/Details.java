package com.jsp.pkg2;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="Info")
@Entity
public class Details {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int userId;
	
	@Embedded
	
	@AttributeOverrides(
			{
				@AttributeOverride(name="work_streetName",column=@Column(name="home_street")),
				@AttributeOverride(name="work_city",column=@Column(name="home_city"))
	})
	private Address Homeaddress;
	private String userName;
	private long contactNo;
	
	@Embedded
	private Address WorkAddress;
	
	public Address getWorkAddress() {
		return WorkAddress;
	}
	public void setWorkAddress(Address workAddress) {
		WorkAddress = workAddress;
	}
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinedDate;

	
	public Address getHomeaddress() {
		return Homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		Homeaddress = homeaddress;
	}
	@Lob
	private String Hobby;

	public String getHobby() {
		return Hobby;
	}
	public void setHobby(String hobby) {
		Hobby = hobby;
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
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

}
