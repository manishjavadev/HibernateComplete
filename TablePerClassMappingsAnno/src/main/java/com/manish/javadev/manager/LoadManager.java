package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.manish.javadev.model.Student;
import com.manish.javadev.util.HibernateUtil;

public class LoadManager {
	public static void main(String[] args) {

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			Student stu = (Student) session.load(Student.class, 1);
			System.out.println(stu);
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}