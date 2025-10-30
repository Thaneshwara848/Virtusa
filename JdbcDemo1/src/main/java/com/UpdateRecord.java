package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // this have inbuild logic to connect / hit to dabase 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
//			Statement stmt = con.createStatement();
//			stmt.execute("insert into Employee values(111, 'Thanesh', 27 ,90000, 'Developer') ");
			PreparedStatement stmt= con.prepareStatement("update employee set salary = salary+ ?  where id  = ? ");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ID : "); int id = sc.nextInt();
			System.out.print("Bonus Salary: "); int salary = sc.nextInt();
			
		
				stmt.setInt(1,salary);
				stmt.setInt(2, id);
				
				stmt.execute();
				System.out.println("Data Updated  succssfully....!");
			
			
			con.close();
			stmt.close();
				
			
				
		} catch (Exception e) {
				System.out.println(e);
		}
	}
}
