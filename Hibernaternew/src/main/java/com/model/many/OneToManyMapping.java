package com.model.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class OneToManyMapping {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Person person = new Person("Sandeep", "1234567890");

		Order order = new Order(1, "Redmi Mobile ", 1);

		Order order2 = new Order(2, "Dell Laptop ", 2);

		order.setPerson(person);
		order.setPerson(person);
		List<Order> orders = new ArrayList<Order>();
		orders.add(order);
		orders.add(order2);

		person.setOrders(orders);

		session.beginTransaction();
		session.persist(person);

		session.getTransaction().commit();

	}

}
