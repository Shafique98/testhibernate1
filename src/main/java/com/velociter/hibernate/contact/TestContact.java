package com.velociter.hibernate.contact;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestContact {

	public static void main(String[] args) {

		Session session = null;

		try {

			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession(); // open the session

			System.out.println("Contact Class");
			System.out.println("Inserting Records......");

			Contact contact = new Contact();	//Contact Class Object
			contact.setFirtName("Shafeeque");
			contact.setLastName("Shaikh");
			contact.setEmail("Shafeeque@velociters.com");
			contact.setMobileNumber("9876543210");
			
			session.save(contact); // Save the contact object in the hibernate

			Transaction tx = session.beginTransaction(); // begin the Transection
			tx.commit();								//Commit Transection

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.flush(); // flush the hibernate session
			session.close(); // close the hibernate session
		}

	}

}
