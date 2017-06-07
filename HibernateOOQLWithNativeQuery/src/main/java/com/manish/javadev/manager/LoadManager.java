package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.SQLQuery;
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

			// 1 Load all Customer
			String strSql1 = "SELECT {cust.*} from Customer cust";
			SQLQuery sqlQuery1 = session.createSQLQuery(strSql1);
			sqlQuery1.addEntity("cust", Customer.class);
			List<Customer> customerList = sqlQuery1.list();

			for (Customer customer : customerList) {
				System.out.println(customer);
			}

			System.out.println("Second condition start");
			// 2 Load Customer based on city
			String strSql2 = "SELECT {cust.*} from Customer cust where cust.city=?";
			SQLQuery sqlQuery2 = session.createSQLQuery(strSql2);
			sqlQuery2.setString(0, "AUS");
			sqlQuery2.addEntity("cust", Customer.class);
			customerList = sqlQuery2.list();

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
