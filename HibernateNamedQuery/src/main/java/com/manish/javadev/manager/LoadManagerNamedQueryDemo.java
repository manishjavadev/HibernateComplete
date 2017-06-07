package com.manish.javadev.manager;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.manish.javadev.model.Employee;
import com.manish.javadev.util.HibernateUtil;

@SuppressWarnings({ "unchecked", "unused" })
public class LoadManagerNamedQueryDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		// HQL Named Query Example
		Query query = session.getNamedQuery("ALL_EMPLOYEE");

		List<Employee> empList = query.list();
		for (Employee emp : empList) {
			System.out.println("Employee Data = " + emp);
		}

		query = session.getNamedQuery("EMPLOYEE_BY_ID");
		query.setInteger("id", 2);
		Employee emp = (Employee) query.uniqueResult();
		System.out.println("Employee Id =  " + emp.getId() + "Employee Name="
				+ emp.getName());

		query = session.getNamedQuery("EMPLOYEE_BY_SALARY");
		query.setDouble("salary", 200);
		empList = query.list();
		for (Employee emp1 : empList) {
			System.out.println(emp1);
		}

		// closing hibernate resources
		sessionFactory.close();
	}

}
