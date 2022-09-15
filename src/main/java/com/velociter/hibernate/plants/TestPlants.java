package com.velociter.hibernate.plants;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPlants {

	public static void main(String[] args) {

		Session session = null;

		try {
			System.out.println("Plants");
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			System.out.println("----loading hibernate.cfg.xml---");
			session = sessionFactory.openSession(); // Open the session
			System.out.println("****Inserting Records*****");
			
			Plants plants = new Plants();
			// plants.setPlantId(100);
			plants.setName("rose");
			plants.setType("plant");
			plants.setCateogry("asian");
			plants.setPrice(10.2f);
			plants.setQty(2);
			plants.setTotalPrice(20.4f);
			
			session.save(plants); // Save the contact object in hibernate session
			
			Transaction tx = session.beginTransaction(); // begin the transaction
			tx.commit();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.flush(); // flush the hibernate session
			session.close(); // Close the hibernate session
		}

	}

}
