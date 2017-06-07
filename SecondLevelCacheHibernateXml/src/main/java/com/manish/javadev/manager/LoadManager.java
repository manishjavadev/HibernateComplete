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
			Customer cust1 = (Customer) session1.load(Customer.class, 1);
			System.out.println(cust1.getCid());
			System.out.println(cust1.getFname());
			session1.close();
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			Session session2 = sf.openSession();
			Customer cust2 = (Customer) session2.load(Customer.class, 1);
			System.out.println(cust2.getCid());
			System.out.println(cust2.getFname());
			session2.close();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}
