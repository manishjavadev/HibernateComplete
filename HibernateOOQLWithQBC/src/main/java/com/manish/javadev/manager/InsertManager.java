package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;


public class InsertManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("Manish", "Srivastava", 27,"BLR");
			session.save(cust);
			cust = new Customer("Deepika", "Chaurasiya", 25,"BLR");			
			session.save(cust);
			cust = new Customer("Rajesh", "Srivastava", 34,"LKO");
			session.save(cust);
			cust = new Customer("Ajay", "Srivastava", 32,"BST");
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
