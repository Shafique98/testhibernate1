package com.velociter.hibernate.payment;

//import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPayment {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			
			
			// ArrayList<Float> amounts = new ArrayList<Float>();

			float[] amount = { 100, 200, 260, 450, 688, 410, 200, 400, 600, 120, 540, 650, 412, 161, 125, 365, 541, 520,
					960, 420 };

			CreditCardPayment cc = new CreditCardPayment();
			CashPayment cash = new CashPayment();
			ChequePayment cheque = new ChequePayment();

			for (int i = 0; i < amount.length; i++) {
				session = sf.openSession();
				System.out.println(amount[i]);
				cash.setAmount(amount[i]);
				cash.setCurrencyType("INR");
				session.save(cash);
				Transaction tx = session.beginTransaction();
				tx.commit();
				session.flush();
			}

			cc.setAmount(6000f);
			cc.setCCType("MasterCard");

			cheque.setAmount(4500f);
			cheque.setChequeNumber(123456);

//			session.save(cc);
//			session.save(cash);
//			session.save(cheque);

//			System.out.println(session);

//			Transaction tx = session.beginTransaction();
//			tx.commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.flush();
				System.out.println("Session Flushed");

				session.close();
			}
		}
	}

}
