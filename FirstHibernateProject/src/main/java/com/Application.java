package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Application {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();

		session.beginTransaction();

		Employee e = new Employee(11, "123@gmail.com", 343211);

		session.persist(e);
		System.out.println("print");

		session.getTransaction().commit();
		System.out.println("Inserted");

	}

}
