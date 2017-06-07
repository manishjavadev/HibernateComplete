package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Address;
import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			// From Student Object we can get Address Object
			Student student = (Student) session.load(Student.class, 1);
			System.out.println(student);
			
			//Address Object from Student Object
			Address address = student.getAddress();
			System.out.println(address);
			
			// From Address Object we can Student Object
			address = (Address) session.load(Address.class, 1);
			System.out.println(address);
			//Student Object from Address Object
			student = address.getStudent();
			System.out.println(student);
		
			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
