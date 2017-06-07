package com.manish.javadev.manager;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Account;
import com.manish.javadev.model.Customer;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;
		Account account = null;
		Customer customer = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			// 1 Load Customer Object
			customer = (Customer) session.load(Customer.class, 1);

			// 2 Get Account List Object using Customer Object
			Set<Account> accountList = customer.getAccounts();
			for (Account acc : accountList) {
				System.out.println(acc);
			}

			// 3 Load Account Object
			account = (Account) session.load(Account.class, 2);

			// 4 Get Customer List Object using Account Object
			Set<Customer> customerList = account.getCustomers();
			for (Customer cust : customerList) {
				System.out.println(cust);
			}
			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}