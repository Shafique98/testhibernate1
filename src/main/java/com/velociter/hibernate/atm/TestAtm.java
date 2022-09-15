package com.velociter.hibernate.atm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAtm {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf= new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			
			ATM atm = new ATM();
			atm.setCostAccNum(531146211);
			atm.setCostAtmPin(1234);
			atm.setCostBankBalance(2500);
			atm.setCostBankStatement("Avaliabla Balance is "+atm.getCostBankBalance());
			
			session.save(atm);
			
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
