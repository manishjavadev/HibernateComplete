package com.manish.javadev.manager;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Customer;
import com.manish.javadev.model.Order;
import com.manish.javadev.util.HibernateUtil;

public class CascadeDeleteManager {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			System.out.println("Loading from Customer");
			Customer cust = (Customer) session.load(Customer.class, 1);
			Set<Order> orders=cust.getOrders();
		
			// Here  we commenting separate deletion cascade will take care of all deletion
			
			/*for (Order order : orders) {
				session.delete(order);
			}*/
			
			session.delete(cust);
			
			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}