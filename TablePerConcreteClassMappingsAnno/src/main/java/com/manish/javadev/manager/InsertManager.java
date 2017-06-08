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
		Transaction tx = null;

		try {
			SessionFactory sf = HibernateUtil.getFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			// 1 Adding one Student
			Student stu = new Student("Manish", "Lucknow");
			stu.setSid(1);

			// 2 Adding Weekday Student
			WeekdayStudent wdstu = new WeekdayStudent("ManishWeekDay", "BLR",
					"8.30PM", "BTM", "MCA", "72");
			wdstu.setSid(2);
			// 3 Adding Weekend Student
			WeekendStudent westu = new WeekendStudent("ManishWeekend", "BLR",
					"4PM", "BTM", "Accenture", "manish@gmail.com");
			session.save(stu);
			westu.setSid(3);
			session.save(wdstu);
			session.save(westu);
			tx.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}
}