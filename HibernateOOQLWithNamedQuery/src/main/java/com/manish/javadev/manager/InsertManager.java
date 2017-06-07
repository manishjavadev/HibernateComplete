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

			Customer customer1 = new Customer("Manish", "Srivastava",
					"manish@gmail.com", 222222, "active");

			Customer customer2 = new Customer("Manish", "Chaurasiya",
					"deepika@gmail.com", 333333, "active");

			Customer customer3 = new Customer("Manish", "Srivastava",
					"ajay@gmail.com", 444444, "notactive");

			Customer customer4 = new Customer("Rajesh", "Srivastava",
					"manish@gmail.com", 555555, "active");

			session.save(customer1);
			session.save(customer2);
			session.save(customer3);
			session.save(customer4);
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
