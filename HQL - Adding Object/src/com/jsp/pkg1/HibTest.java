package com.jsp.pkg1;

import java.util.List;
import java.util.Random;

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
//		Query q=session.createQuery("from Details where marks>30");
//		List <Details> detail=q.list();
//		for(Details d: detail){
//			System.out.println("Roll Number: "+d.getRollno()+", Student Name: "+d.getName()+", Marks: "+d.getMarks());
//		}
		Query q=session.createQuery("from Details where rollno=2");
		Details d=(Details) q.uniqueResult();
		System.out.println("Roll Number: "+d.getRollno()+", Student Name: "+d.getName()+", Marks: "+d.getMarks());		
		session.getTransaction().commit();
		session.close();
	}
}              