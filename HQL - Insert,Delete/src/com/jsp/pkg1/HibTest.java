package com.jsp.pkg1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.pkg2.Details;
import com.jsp.pkg2.Vehicle;

public class HibTest {
	
	public static void main(String[] args){
		
				
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();

//		for(int i=0;i<=10;i++){
//			Details u1=new Details();
//			u1.setUserName("lily"+i);
//			u1.setJoinedDate(new Date());
//			session.save(u1);
//		} //this is used to store the details in a table
		Details user=(Details) session.get(Details.class, 6);
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		System.out.println(user.getUserName());
	}
}















