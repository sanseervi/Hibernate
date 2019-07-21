package com.jsp.pkg1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.pkg2.Address;
import com.jsp.pkg2.Details;

public class HibTest {
	
	public static void main(String[] args){
		
		Details user4= new Details();
		user4.setContactNo(1504);
		user4.setUserName("San");
		user4.setJoinedDate(new Date());
		user4.setHobby("Editing");
		
		Address a1=new Address();
		a1.setStreetName("IndraNagar");
		a1.setCity("Bangalore");
		user4.getListOFAddress().add(a1);
		
		Address a2=new Address();
		a2.setStreetName("Bandra");
		a2.setCity("Mumbai");
		user4.getListOFAddress().add(a2);
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();

		session.save(user4);
		
		session.getTransaction().commit();
		session.close();
		
		user4=null;
		int temp=0;
		session=sessionFactory.openSession();
		user4=(Details)session.get(Details.class, 1);
		temp=user4.getListOFAddress().size();
		session.close();
		System.out.println(temp);
		System.out.println(user4.getUserName());
						
	}
}