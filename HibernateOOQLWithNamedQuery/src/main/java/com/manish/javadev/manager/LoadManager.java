package com.manish.javadev.manager;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;

@SuppressWarnings("unchecked")
public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			System.out.println("1st Operation Select All Customer");
			
			List<Customer> customerList = session.getNamedQuery("ALL_CUSTOMER").list();
			for (Customer customer : customerList) {
				System.out.println(customer);
			}
			System.out.println("2nd Operation Select all Active Customer");
			Query query = session.getNamedQuery("ALL_ACTIVE_CUSTOMER");
			query.setString("status", "active");
			customerList = query.list();
			for (Customer customer : customerList) {
				System.out.println(customer);
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
