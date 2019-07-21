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

		Details user=(Details) session.get(Details.class, 4);
		user.setUserName("lilly Good For Health");
		
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}
}















