package com.manish.javadev.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Employee;
import com.manish.javadev.model.EmployeeAddress;
import com.manish.javadev.util.HibernateUtil;

public class InsertManager {
	public static void main(String[] args) {
		// Prep work
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// Save Employee 1
		Employee emp = new Employee("Rajesh", 100);
		EmployeeAddress empAddress = new EmployeeAddress("Lucknow",
				"Uttar Pradesh");
		session.save(emp);
		empAddress.setEmpId(emp.getId());
		session.save(empAddress);

		// Save Employee 2
		emp = new Employee("Manish", 200);
		empAddress = new EmployeeAddress("Bangalore", "Karnatka");
		session.save(emp);
		empAddress.setEmpId(emp.getId());
		session.save(empAddress);

		// Save Employee 3
		emp = new Employee("Deepika", 300);
		empAddress = new EmployeeAddress("Kanpur", "Uttar Pradesh");
		session.save(emp);
		empAddress.setEmpId(emp.getId());
		session.save(empAddress);

		// Save Employee 4
		emp = new Employee("Divya", 400);
		empAddress = new EmployeeAddress("Noida", "Delhi");
		session.save(emp);
		empAddress.setEmpId(emp.getId());
		session.save(empAddress);

		// Save Employee 5
		emp = new Employee("Ankita", 500);
		empAddress = new EmployeeAddress("Gorakhpur", "Uttar Pradesh");
		session.save(emp);
		empAddress.setEmpId(emp.getId());
		session.save(empAddress);

		tx.commit();
		session.close();
		System.out.println("Done");
	}
}
