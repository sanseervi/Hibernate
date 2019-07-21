package com.jsp.pkg1;

import java.util.Date;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.jsp.pkg2.Details;

public class HibTest
{	
	public static void main(String[] args)
	{			
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		
//		int minUserId=5;
//		String us1="Error";
		
		Query query =session.getNamedQuery("Corona");
//		query.setInteger(0,minUserId);

		List <Details> user=(List <Details>) query.list();
		
		for(Details u1: user){
			System.out.println(u1.getUserName());
		}
		session.getTransaction().commit();
		session.close();
		
	}
}              