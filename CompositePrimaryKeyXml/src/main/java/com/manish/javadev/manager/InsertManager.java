package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.manish.javadev.model.AccountId;
import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			// Here First we constructing AccountId as key
			// then will save the Customer record
			AccountId accountId = new AccountId(101, "SA", 100);
			Customer cust = new Customer("Manish", "Srivastava", 27, accountId);
			session.save(cust);
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
