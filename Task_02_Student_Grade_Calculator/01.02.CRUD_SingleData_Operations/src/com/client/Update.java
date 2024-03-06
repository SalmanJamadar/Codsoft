package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Update {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Student s=new Student();
		s.setRollno(4);
		s.setName("sahil");
		s.setAdr("manchar");
		
		session.update(s);
		session.beginTransaction().commit();
		
		
	}
	
	
}
