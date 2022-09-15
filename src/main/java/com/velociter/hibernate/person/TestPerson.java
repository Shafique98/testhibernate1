package com.velociter.hibernate.person;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPerson {

	public static void main(String[] args) {

		Session session = null;
		try {
			
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			// Name name = new Name('M',"Shafeeque","Shaikh");
			
			Person Shafeeque = new Person(new Date(2), new Name('M', "Shafeeque", "Shaikh"),new PersonQualification("TSEC", "BTECH"));
			Person Shweta = new Person(new Date(2), new Name('M', "Shweta", "Mishra"),new PersonQualification("Medicaps", "MSA"));
			Person Danish = new Person(new Date(2), new Name('M', "Danish", "Qureshi"),new PersonQualification("IPS Acadany", "MSA"));
			
			session.save(Shafeeque);
			session.save(Shweta);
			session.save(Danish);
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
