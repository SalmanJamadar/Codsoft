package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Delete {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Student s = new Student();
		s.setRollno(2);
		
		session.delete(s);
		session.beginTransaction().commit();

	}

}
