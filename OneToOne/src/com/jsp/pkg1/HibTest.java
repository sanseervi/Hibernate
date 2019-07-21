package com.jsp.pkg1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.pkg2.Details;
import com.jsp.pkg2.Vehicle;

public class HibTest {
	
	public static void main(String[] args){
		
		Details user= new Details();
		user.setUserName("San");
		user.setJoinedDate(new Date());
		
		Details user2= new Details();
		user2.setUserName("Deep");
		user2.setJoinedDate(new Date());
		
		Vehicle v1= new Vehicle();
		v1.setVehicle_name("Roadster");
		v1.setDetails(user);
		
		Vehicle v2= new Vehicle();
		v2.setVehicle_name("Kodiaq");
		v2.setDetails(user);
		
		Vehicle v3= new Vehicle();
		v3.setVehicle_name("Mustang");
		v3.setDetails(user2);
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();

		session.save(user);
		session.save(user2);
		session.save(v1);
		session.save(v2);
		session.save(v3);
		
		session.getTransaction().commit();
		session.close();
	}
}