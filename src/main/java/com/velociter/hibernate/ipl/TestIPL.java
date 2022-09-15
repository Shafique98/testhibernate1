package com.velociter.hibernate.ipl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestIPL {

	public static void main(String[] args) {
		Session session = null;
		try{
			System.out.println("Start Ipl");
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			IPL_ScoreBoard player = new IPL_ScoreBoard();
			player.setPlayerFirstName("Virat");
			player.setPlayerLastName("Kohli");
			player.setIPLRuns(250);
			player.setNumOfFour(41);
			player.setNumOfSix(12);
			player.setStrikeRate(53.2f);
			player.setAVGRuns(530.6f);
			player.setCentury(9);
			player.setHalfCentury(6);
			
			session.save(player);
			
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
