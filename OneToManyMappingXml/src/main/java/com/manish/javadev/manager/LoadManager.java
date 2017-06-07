package com.manish.javadev.manager;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Customer;
import com.manish.javadev.model.Order;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			//Getting Customer Object
			Customer customer = (Customer) session.load(Customer.class, 1);
			System.out.println(customer);

			//From Customer Object getting all orders
			Set<Order> orders = customer.getOrders();
			for (Order order : orders) {
				System.out.println(order);
			}

		
			//getting Order object
			Order order = (Order) session.load(Order.class, 2);

			//From order object getting customer object 
			customer = order.getCustomer();
			System.out.println(customer);

			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}