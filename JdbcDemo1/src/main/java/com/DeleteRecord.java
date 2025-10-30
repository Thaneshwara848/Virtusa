package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // this have inbuild logic to connect / hit to dabase 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
//			Statement stmt = con.createStatement();
//			stmt.execute("insert into Employee values(111, 'Thanesh', 27 ,90000, 'Developer') ");
			PreparedStatement stmt= con.prepareStatement("delete from employee where id  = ? ");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ID : "); int id = sc.nextInt();
			
			System.out.println("Do You Reallty want to Delete ? Y / no ");
			String ch= sc.next();
			if(ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("Y")) {
				stmt.setInt(1,id );
				stmt.execute();
				System.out.println("Data Deleted  succssfully....!");
			}
			else {
				System.out.println("Data Not Dleted ...!");
			}
			
			
			con.close();
			stmt.close();
				
			
				
		} catch (Exception e) {
				System.out.println(e);
		}
	}
}
