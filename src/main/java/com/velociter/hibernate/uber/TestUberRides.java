package com.velociter.hibernate.uber;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestUberRides {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			
			UberRides ride = new UberRides();
			ride.setRiderName("Shafeeque");
			ride.setPickUpLocation("Vijay Nagar");
			ride.setDropOffLocation("Shree Aurobindo Hospital");
			ride.setRideFare(100.0f);
			ride.setCaptainName("John");
			ride.setRideDistance(8.5f);
			ride.setPaymentMethod("Cash");
			ride.setVehicalType("Bike");
			session.save(ride);
			
			Transaction tx = session.beginTransaction();
			tx.commit();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.flush();
			session.close();
		}
	}

}
