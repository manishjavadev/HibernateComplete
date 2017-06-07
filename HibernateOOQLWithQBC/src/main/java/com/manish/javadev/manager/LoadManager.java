package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

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

			Criteria critr1 = session.createCriteria(Customer.class);
			List<Customer> list1 = critr1.list();
			for (Customer cust : list1) {
				System.out.println(cust.getCid() + "\t" + cust.getFname()
						+ "\t" + cust.getLname() + "\t" + cust.getAge() + "\t"
						+ cust.getCity());
				System.out.println("==================");
			}

			// 2 Get Customer based on City from database
			System.out.println("===2nd Condition start from here===");
			Criteria critr2 = session.createCriteria(Customer.class);
			critr2 = critr2.add(Expression.eq("city", "BLR"));
			List<Customer> list2 = critr2.list();
			for (Object cust1 : list2) {
				Customer cust = (Customer) cust1;
				System.out.println(cust.getCid() + "\t" + cust.getFname()
						+ "\t" + cust.getLname() + "\t" + cust.getAge() + "\t"
						+ cust.getCity());
			}

			// 3 Get Customer based on City and age from database
			System.out.println("===3rd Condition start from here===");
			Criteria critr3 = session.createCriteria(Customer.class);
			critr3 = critr3.add(Expression.and(Expression.eq("city", "GKP"),
					Expression.eq("age", 32)));
			List list3 = critr3.list();

			for (Object cust1 : list3) {
				Customer cust = (Customer) cust1;
				System.out.println(cust.getCid() + "\t" + cust.getFname()
						+ "\t" + cust.getLname() + "\t" + cust.getAge() + "\t"
						+ cust.getCity());
			}
			// 4 Get Customer based on City and age from database
			System.out.println("===4th Condition start from here===");
			Criteria critr4 = session.createCriteria(Customer.class);
			/* critr4 = critr4.add(Restrictions.like("city", "BL%")); */
			critr4 = critr4.add(Restrictions.between("age", 27, 36));
			List list4 = critr4.list();

			for (Object cust1 : list4) {
				Customer cust = (Customer) cust1;
				System.out.println(cust.getCid() + "\t" + cust.getFname()
						+ "\t" + cust.getLname() + "\t" + cust.getAge() + "\t"
						+ cust.getCity());
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
