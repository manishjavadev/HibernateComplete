package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session1 = sf.openSession();
			tx = session1.beginTransaction();

			Customer cust = (Customer) session1.load(Customer.class, 1);
			System.out.println("Customer 1 = "+ cust);
			
			

			tx.commit();
			session1.close();

			System.out.println("======");
			
			
			Session session2 = sf.openSession();
			tx = session2.beginTransaction();

			cust = (Customer) session2.load(Customer.class, 1);
			System.out.println("Customer 1 = "+ cust);
			
			

			tx.commit();
			session2.close();

			
			
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}