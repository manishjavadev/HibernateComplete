package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Customer;
import com.manish.javadev.model.Order;
import com.manish.javadev.util.HibernateUtil;

public class CascadeDeleteOrphanManager {
	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			System.out.println("Loading Customer Object");
			Customer cust = (Customer) session.load(Customer.class, 1);

			System.out.println("Loading order objects");
			Order order1 = (Order) session.load(Order.class, 1);
			Order order2 = (Order) session.load(Order.class, 2);

			// Here we are deleting
			// After enable cascade delete-orphan, if you removing above order
			// from list it should be removed from data base after saveOrUpdate
			cust.getOrders().remove(order1);
			cust.getOrders().remove(order2);
			session.saveOrUpdate(cust);

			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
