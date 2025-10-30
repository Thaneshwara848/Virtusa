package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDimic {
	public static void main(String[] args) {
		try {
//					Class.forName("com.mysql.cj.jdbc.Driver"); // this have inbuild logic to connect / hit to dabase 
//					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
//					Statement stmt = con.createStatement();
//					stmt.execute("insert into Employee values(111, 'Thanesh', 27 ,90000, 'Developer') ");
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // this have inbuild logic to connect / hit to dabase 
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
					PreparedStatement stmt= con.prepareStatement("insert into Employee values(?,?,? ,?, ?)");
					Scanner sc = new Scanner(System.in);
					System.out.print("ID : "); int id = sc.nextInt();
					System.out.print("Name : ");  String name = sc.next();
					System.out.print("Age : ");  int age = sc.nextInt();
					System.out.print("Salary : ");  int salary = sc.nextInt();
					System.out.print("Designation : "); String desig = sc.next();
					
					stmt.setInt(1,id );
					stmt.setString(2, name);
					stmt.setInt(3, age);
					stmt.setInt(4, salary);
					stmt.setString(5, desig);
					
					stmt.execute();
					
					con.close();
					stmt.close();
						
					System.out.println("Data Inserted succssfully....!");
						
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
