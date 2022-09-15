package com.velociter.hibernate.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			System.out.println("Employee Class");
			session = sf.openSession();
			Employee employee = new Employee();
			System.out.println("Inserting Revords.......");
			employee.setFirstName("Shafique");
			employee.setLastName("Shaikh");
			employee.setEmail("shaikh@velociters.com");
			employee.setMobileNumber("9876543210");
			employee.setAddress("Khajrana");
			employee.setOfficeLocation("Indore");
			session.save(employee);
			
			Transaction tx = session.beginTransaction();
			tx.commit();
			
		}catch (Exception e) {
		System.out.println(e.getMessage());
		}finally {
			session.flush();
			session.close();
		}
	}

}
