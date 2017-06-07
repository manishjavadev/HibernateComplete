package com.manish.javadev.manager;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.manish.javadev.model.Account;
import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// 1 add Customer
			Customer cust1 = new Customer("Manish1", "manish@gmail.com",
					new Date(), new Long(222222));
			Customer cust2 = new Customer("Manish2", "manish@gmail.com",
					new Date(), new Long(222222));
			Customer cust3 = new Customer("Manish3", "manish@gmail.com",
					new Date(), new Long(222222));
			session.save(cust1);
			session.save(cust2);
			session.save(cust3);
			
			// 2 add Accounts
			Account acc1 = new Account("SA", 500000);
			Account acc2 = new Account("SA", 500000);
			Account acc3 = new Account("SA", 500000);
			
			session.save(acc1);
			session.save(acc2);
			session.save(acc3);
			
			Set<Account> aset = new HashSet<Account>();
			
			aset.add(acc1);
			aset.add(acc2);
			aset.add(acc3);
			cust1.setAccounts(aset);
			
			aset = new HashSet<Account>();
			aset.add(acc2);
			aset.add(acc3);
			cust2.setAccounts(aset);
			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}