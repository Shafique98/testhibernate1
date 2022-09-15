package com.velociter.hibernate.payment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		Session session = null;
		String path = "D:/Project/testhibernate/properties/PaymentDetails.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		try {
			System.out.println("Start");
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			// session = sf.openSession();
			System.out.println("hibernate.xml");
			for (int i = 1; i < 21; i++) {
				if (i < 10) {
					if (prop.getProperty("payment.0" + i + ".currencyType").equals("")
							&& prop.getProperty("payment.0" + i + ".ccType").equals("")) {
						System.out.println("cheque 0"+i);
						ChequePayment cheque = new ChequePayment();
						cheque.setAmount(Integer.parseInt(prop.getProperty("payment.0" + i + ".ammount")));
						cheque.setChequeNumber(Integer.parseInt(prop.getProperty("payment.0" + i + ".chequeNumber")));
						
						cheque.setPaymentID(Long.parseLong(prop.getProperty("payment.0" + i + ".id")));
						
						session = sf.openSession();
						session.save(cheque);
						cheque = null;
						Transaction tx = session.beginTransaction();
						tx.commit();
						session.flush();
					}

				} else {
					if (prop.getProperty("payment." + i + ".currencyType").equals("")
							&& prop.getProperty("payment." + i + ".ccType").equals("")) {
						System.out.println("cheque "+i);
						ChequePayment cheque = new ChequePayment();
						cheque.setAmount(Integer.parseInt(prop.getProperty("payment." + i + ".ammount")));
						cheque.setChequeNumber(Integer.parseInt(prop.getProperty("payment." + i + ".chequeNumber")));
						cheque.setPaymentID(Long.parseLong(prop.getProperty("payment." + i + ".id")));
						session = sf.openSession();
						session.save(cheque);
						cheque = null;
						Transaction tx = session.beginTransaction();
						tx.commit();
						session.flush();

					}
				}
			}

			for (int i = 1; i < 21; i++) {
				if (i < 10) {
					if (prop.getProperty("payment.0" + i + ".chequeNumber").equals("")
							&& prop.getProperty("payment.0" + i + ".ccType").equals("")) {
						session = sf.openSession();
						System.out.println("cash 0"+i);
						CashPayment cash = new CashPayment();
						cash.setAmount(Integer.parseInt(prop.getProperty("payment.0" + i + ".ammount")));
						cash.setCurrencyType(prop.getProperty("payment.0" + i + ".currencyType"));
						cash.setPaymentID(Long.parseLong(prop.getProperty("payment.0" + i + ".id")));
						session.save(cash);
						cash = null;
						Transaction tx = session.beginTransaction();
						tx.commit();
						session.flush();
					}

				} else {
					if (prop.getProperty("payment." + i + ".chequeNumber").equals("")
							&& prop.getProperty("payment." + i + ".ccType").equals("")) {
						session = sf.openSession();
						System.out.println("cash "+i);
						CashPayment cash = new CashPayment();
						cash.setAmount(Integer.parseInt(prop.getProperty("payment." + i + ".ammount")));
						cash.setCurrencyType(prop.getProperty("payment." + i + ".currencyType"));
						cash.setPaymentID(Long.parseLong(prop.getProperty("payment." + i + ".id")));
						session.save(cash);
						cash = null;
						Transaction tx = session.beginTransaction();
						tx.commit();
						session.flush();

					}
				}
			}

			for (int i = 1; i <=20; i++) {
				if (i < 10) {
					if (prop.getProperty("payment.0" + i + ".chequeNumber").equals("")
							&& prop.getProperty("payment.0" + i + ".currencyType").equals("")) {
						System.out.println("CCTYPE 0"+i);
						CreditCardPayment ccType = new CreditCardPayment();
						session = sf.openSession();
						ccType.setAmount(Integer.parseInt(prop.getProperty("payment.0" + i + ".ammount")));
						ccType.setCCType(prop.getProperty("payment.0" + i + ".ccType"));
						ccType.setPaymentID(Long.parseLong(prop.getProperty("payment.0" + i + ".id")));
						
						session.save(ccType);
						ccType = null;
						Transaction tx = session.beginTransaction();
						tx.commit();
						session.flush();
					}

				} else {
					if (prop.getProperty("payment." + i + ".chequeNumber").equals("")
							&& prop.getProperty("payment." + i + ".currencyType").equals("")) {
						System.out.println("CCTYPE "+i);
						session = sf.openSession();
						CreditCardPayment ccType = new CreditCardPayment();
						ccType.setAmount(Integer.parseInt(prop.getProperty("payment." + i + ".ammount")));
						ccType.setCCType(prop.getProperty("payment." + i + ".ccType"));
						ccType.setPaymentID(Long.parseLong(prop.getProperty("payment." + i + ".id")));
						session.save(ccType);
						ccType = null;
						Transaction tx = session.beginTransaction();
						tx.commit();
						session.flush();

					}
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			session.flush();
			session.close();

		}

//		System.out.println("cheque Payments");
//		for(int i=1;i<=21;i++) {
////			if(prop.getProperty("payment."+i+".currencyType").equals("") && prop.getProperty("payment."+i+".ccType").equals("")) {
////				System.out.print("payment."+i+".ammount :");
//				System.out.println(prop.getProperty("payment."+i+".ammount"));				
//			}

//		}
//		System.out.println("Cash Payments:");
//		for(int i=1;i<=6;i++) {
////			if(prop.getProperty("payment."+i+".cheque").equals("") && prop.getProperty("payment."+i+".ccType").equals("")) {
//				System.out.println("payment."+i+".ammount");
////				System.out.println(prop.getProperty("payment."+i+".ammount"));				
////			}
//	
//		}
//		System.out.println("Credit card Payments:");
//		for(int i=1;i<=6;i++) {
////			if(prop.getProperty("payment."+i+".currencyType").equals("") && prop.getProperty("payment."+i+".cheque").equals("")) {
//				System.out.println("payment."+i+".ammount");
////				System.out.println(prop.getProperty("payment."+i+".ammount"));
//				
////			}
//	
//		}

	}

}
