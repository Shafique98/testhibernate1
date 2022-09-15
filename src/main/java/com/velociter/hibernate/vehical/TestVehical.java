package com.velociter.hibernate.vehical;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestVehical {

	
	public static void main(String[] args) {
		Session session = null;
		try {

			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			System.out.println("Vehical Class");
			System.out.println("Inserting records.......");
			Vehical vehical = new Vehical();
			vehical.setVehicalType("bike");
			vehical.setChasisNumber(23454);
			vehical.setCompanyName("Honda");
			vehical.setVehicalNumber("MP09XB1234");
			vehical.setModelType("Hero");
			vehical.setColor("Red");
			vehical.setFuelType("Petrol");
			vehical.setNumberOfTyres(2);

			session.save(vehical);
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
