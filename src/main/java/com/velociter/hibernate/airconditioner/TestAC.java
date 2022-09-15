package com.velociter.hibernate.airconditioner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAC {

	public static void main(String[] args) {
		
		Session session = null;
		
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			
			session = sf.openSession();
			AirConditioner ac = new AirConditioner();
			ac.setAcName("Panasonic");
			ac.setAcCapacity("1.5 Ton");
			ac.setAcColor("White");
			ac.setAcEnergyStars(3);
			ac.setSpecialFeature("Auto Sleep");
			ac.setWarranty("1 Year");
			ac.setMinTemp(16f);
			ac.setMaxTemp(32f);
			
			session.save(ac);
			
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
