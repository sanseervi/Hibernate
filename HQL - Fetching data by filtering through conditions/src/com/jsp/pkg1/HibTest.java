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
		
		String minUserId="5";
		String us1="Error";
		Query query =session.createQuery("from Details where userid>:minUser and userName=:name");
		query.setInteger("minUser",Integer.parseInt(minUserId));
		query.setString("name",us1);
		List <Details> user=(List <Details>) query.list();
		
		for(Details u1: user){
			System.out.println(u1.getUserName());
			System.out.println(u1.getJoinedDate());
		}
		session.getTransaction().commit();
		session.close();
	}
}              