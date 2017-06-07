package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Student;
import com.manish.javadev.model.WeekdayStudent;
import com.manish.javadev.model.WeekendStudent;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		// Prep work
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// 1 Adding one Student
		Student stu = new Student("Manish", "Lucknow");
		Integer result = (Integer) session.save(stu);
		System.out.println(result);

		// 2 Adding Weekday Student
		WeekdayStudent wdstu = new WeekdayStudent("ManishWeekDay", "BLR",
				"8.30PM", "BTM", "MCA", "72");
		result = (Integer) session.save(wdstu);
		System.out.println(result);

		// 3 Adding Weekend Student
		WeekendStudent westu = new WeekendStudent("ManishWeekend", "BLR",
				"4PM", "BTM", "Accenture", "manish@gmail.com");
		result = (Integer) session.save(westu);
		System.out.println(result);
		tx.commit();
		session.close();
		System.out.println("Done");
	}
}
