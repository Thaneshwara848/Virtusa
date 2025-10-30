package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecord {
	public static void main(String[] args) {
		try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // this have inbuild logic to connect / hit to dabase 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
					Statement stmt = con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from Employee");
					while(rs.next()) {
		System.out.println(rs.getInt(1) + " : "+rs.getString(2)+": "+rs.getInt("Age")+" : "+rs.getInt(4)+" : "+rs.getString(5));
					}
					
						con.close();
						stmt.close();
						
//						
						
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}	
