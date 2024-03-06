package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Create {

	public static void main(String[] args) {
		
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
    	SessionFactory sf=cfg.buildSessionFactory();
		
    	Session session=sf.openSession();
		
		
	//	Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		
		Student s=new Student();
		s.setRollno(5);
		s.setName("pqr");
		s.setAdr("pimpri");
		
		session.save(s);
		session.beginTransaction().commit();
		
	}
}
