
package com.velociter.hibernate.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmp {
	

	public static void main(String[] args) {
		Session session = null;
		try {
			System.out.println("Start EMP");
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			
			Emp emp1 = new Emp("Shafeeque",new Address("Indore","MP","INDIA",452010));
			
			session.save(emp1);
			
			Transaction tx = session.beginTransaction();
			tx.commit();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			session.flush();
			session.close();
		}
	}

}
