package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.manish.javadev.model.Address;
import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Student stu = new Student("Manish", "manish@gmail.com", "11111");
			session.save(stu);
			Address add = new Address("NGR Layout", "BLR", "Karnatka");
			session.save(add);
			stu.setAddress(add);
			add.setStudent(stu);
			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
