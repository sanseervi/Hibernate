package com.jsp.pkg1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.pkg2.Details;
import com.jsp.pkg2.Vehicle;

public class HibTest {
	
	public static void main(String[] args){
		
		Details user1= new Details();
		user1.setUserName("lily");
		user1.setJoinedDate(new Date());
		
		Details user= new Details();
		user.setUserName("San");
		user.setJoinedDate(new Date());
		
		
		Vehicle v1= new Vehicle();
		v1.setVehicle_name("Roadster");
		v1.setUser(user);
		user.getVehicle().add(v1);
		
		Vehicle v2= new Vehicle();
		v2.setVehicle_name("Kodiaq");
		v2.setUser(user);
		user.getVehicle().add(v2);
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();

		session.save(user);
		session.save(user1);
		session.save(v1);
		session.save(v2);
		
		session.getTransaction().commit();
		session.close();
	}
}















