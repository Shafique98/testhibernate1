package com.velociter.hibernate.bank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBankerDetails {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			
			BankerDetails banker = new BankerDetails();
			banker.setBankerName("Shafeeque");
			banker.setBankerContact("9876543210");
			banker.setBankerOccupation("Software Devloper");
			banker.setBankerAddress("143/5 Khajrana Indore");
			banker.setBankerAccountNumber(950541367);
			banker.setBankerAccountType("Saving");
			banker.setBankerAccountBalance(2.3f);
			banker.setBankerAtmNumber(987875236);
			banker.setBankerBranchName("SBI Vijay Nagar");
			banker.setBankerBranchIfscCode("SBIN05246");
			banker.setBankerBranchAddress("Vijay Nagar Indore");
			banker.setBankerBranchContactNumber("07325245632");
			
			session.save(banker);
			
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
