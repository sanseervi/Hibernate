package com.jsp.pkg2;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Table(name="Tesla")
@Entity
public class Details {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int userId;
	
	@ElementCollection
	@JoinTable(name="Address",
	joinColumns=@JoinColumn(name="userID1"))
	@GenericGenerator(name= "hilo-gen", strategy= "increment")
	@CollectionId(columns ={ @Column(name= "Address_id")}, generator = "hilo-gen", type= @Type (type="long"))
	private Collection<Address> linstOFAddress=new ArrayList();
	
	
	public Collection<Address> getLinstOFAddress() {
		return linstOFAddress;
	}
	public void setLinstOFAddress(Collection<Address> linstOFAddress) {
		this.linstOFAddress = linstOFAddress;
	}
	
	private String userName;
	private long contactNo;
	
	@Embedded	
	@Temporal(TemporalType.DATE)
	private Date joinedDate;

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
