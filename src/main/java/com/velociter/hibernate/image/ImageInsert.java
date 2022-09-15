package com.velociter.hibernate.image;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageInsert {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "testHibernate", "hibernate");
			PreparedStatement ps = con.prepareStatement("INSERT INTO IMAGE_TAB(NAME,IMAGE) VALUES(?,?)");
			ps.setString(1, "image");
			
			FileInputStream input = new FileInputStream("d:\\img.png");
			
			ps.setBinaryStream(2, input, input.available());
			
			int i = ps.executeUpdate();
			System.out.println(i+ " Record inserted ");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
