package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.util.HibernateUtil;

public class ScalerReturn {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			System.out.println("1st Operation Select All Customer");
			Query query = session.getNamedQuery("GET_SCALER_RETURN");
			query.setString("fname", "Manish");
			List<Object[]> customerList= (List<Object[]>)query.list();
			for (Object[] err : customerList) {
				System.out.println(err[0]);
				System.out.println(err[1]);
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
