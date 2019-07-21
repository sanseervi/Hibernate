package com.jsp.pkg1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.pkg2.Address;
import com.jsp.pkg2.Details;

public class HibTest {
	
	public static void main(String[] args){
		
//		UserDetails user1= new UserDetails();
//		user1.setContactNo(1501);
//		user1.setUserName("ModelS");
//		user1.setJoinedDate(new Date());
//		
//		UserDetails user2= new UserDetails();
//		user2.setContactNo(1502);
//		user2.setUserName("ModelX");
//		user2.setJoinedDate(new Date());
//		
//		UserDetails user3= new UserDetails();
//		user3.setContactNo(1503);
//		user3.setUserName("ModelBeta");
//		user3.setJoinedDate(new Date());
		
		Details user4= new Details();
		user4.setContactNo(1504);
		user4.setUserName("San");
		user4.setJoinedDate(new Date());
		user4.setHobby("Editing");
		
		Address a1=new Address();
		a1.setStreetName("IndraNagar");
		a1.setCity("Bangalore");
		user4.getLinstOFAddress().add(a1);
		
		Address a2=new Address();
		a2.setStreetName("Bandra");
		a2.setCity("Mumbai");
		user4.getLinstOFAddress().add(a2);
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
/*//		UserDetails u1=(UserDetails)session.get(UserDetails.class, 2);
//		System.out.println(u1.getUserName());
*/		
//		session.save(user1);
//		session.save(user2);
//		session.save(user3);
		session.save(user4);
		
		session.getTransaction().commit();
		session.close();
	}
}