package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {
	public static void main(String[] args) {
		// Prep work
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Student stu = (Student) session.load(Student.class, 1);
		System.out.println(stu);
		session.close();
		System.out.println("Done");
		tx.commit();
		session.close();
		System.out.println("Done");
	}
}
