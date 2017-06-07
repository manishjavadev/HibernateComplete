package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.util.HibernateUtil;

@SuppressWarnings("unchecked")
public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			/*"Here you are going to load data using return Scalar"
			That Will load only Customer FirstName and LastName */
			
			Query query = session.getNamedQuery("GET_SCALER_RETURN");
			query.setString("fname", "Manish");
			
			List<Object[]> customerList = (List<Object[]>) query.list();
			for (Object[] err : customerList) {
				System.out.print("FirstName: "+ err[0] +"    And LastName: " + err[1] +"\n");
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
