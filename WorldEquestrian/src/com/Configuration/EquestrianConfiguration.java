package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class EquestrianConfiguration {
	public static Connection getEquestConfig() {
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/worldequestrian", "root", "dhas96");
			System.out.println("\tConfiguration Completed....!!!!!");
		} catch (Exception e) {
			System.out.println("\tThe Process is Ongoing.......");
		}
		if(con != null) {
			System.out.println("\tConection success....!!!!");
			return con;
		}else {
		System.out.println("\tConection is Fail....!");
		return null;
		}
		
		
	}

}
