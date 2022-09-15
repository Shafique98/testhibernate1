package com.velociter.hibernate.image;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageRetrive {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "testHibernate","hibernate");
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM IMAGE_TAB");
			ResultSet rs = ps.executeQuery();
			FileOutputStream out = null;
			if (rs.next()) {
				Blob blob = rs.getBlob(2);
				byte barr[] = blob.getBytes(1, (int) blob.length());

				out = new FileOutputStream("c:\\Image2.png");
				out.write(barr);
			}
			System.out.println(out+" created");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
