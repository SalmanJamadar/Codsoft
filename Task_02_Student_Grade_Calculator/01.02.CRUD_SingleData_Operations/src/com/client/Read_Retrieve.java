package com.client;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Read_Retrieve {

	public static void main(String[] args) {
		
		Session session= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Student s= session.get(Student.class,4);
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAdr());	
	}
}
