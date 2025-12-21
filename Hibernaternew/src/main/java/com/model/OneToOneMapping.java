package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class OneToOneMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = new User("Deepak", null);

		
		session.persist(user);
		session.getTransaction().commit();

	}

}
