package com.velociter.hibernate.productdetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestProduct {

	public static void main(String[] args) {
		Session session = null;
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			
			ProductDetail product = new ProductDetail();
			product.setProdName("Samsung galaxy");
			product.setProdCategory("Mobile Phones");
			product.setProdType("Electronics");
			product.setProdMaterial("Plastic & Metel");
			product.setProdCapacity("8/128 GB");
			product.setProdSplFeature("64px Camera,4500mh bettry & 48 hrs stand by");
			
			session.save(product);
			
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
