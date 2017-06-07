package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.AccountId;
import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// This AccountId is hard coded
			// here you can make dynamic as per your application
			AccountId accountId = new AccountId(101, "SA", 100);
			Customer cust = (Customer) session.load(Customer.class, accountId);
			System.out.println(cust.getFname() + "\t" + cust.getLname() + "\t"
					+ cust.getAge());
			tx.commit();
			session.close();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}
