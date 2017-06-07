package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
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
			Session session = sf.openSession();
			tx = session.beginTransaction();

			// 1 Get all Customer from database
			String sql = "from Customer cust";
			Query query = session.createQuery(sql);
			List<Customer> allCust = query.list();
			for (Customer cust : allCust) {
				System.out.println(cust);
				System.out.println("==================");
			}

			// 2 Get Customer based on City and age from database
			System.out.println("Based on City and Age");
			String sql1 = "from Customer cust where cust.city=? and cust.age=?";
			Query query1 = session.createQuery(sql1);
			query1.setParameter(0, "BLR");
			query1.setParameter(1, 27);
			List custObj = query1.list();
			for (Object cust1 : custObj) {
				Customer cust = (Customer) cust1;
				System.out.println(cust);
				System.out.println("==================");
			}
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
