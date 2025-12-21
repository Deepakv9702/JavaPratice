package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Passport;
import com.model.User;
import com.model.many.Order;
import com.model.many.Person;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = null;
	private static SessionFactory sessinoFactory = null;

	public static SessionFactory getSessionFactory()  {

		if (sessinoFactory == null) {

			Configuration cfg = new Configuration();

			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Passport.class);
			cfg.addAnnotatedClass(Person.class);
			cfg.addAnnotatedClass(Order.class);

			cfg.buildSessionFactory();

			return sessionFactory;
		}
		return sessionFactory;
	}

}