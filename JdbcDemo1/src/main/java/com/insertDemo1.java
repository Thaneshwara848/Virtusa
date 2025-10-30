package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertDemo1 {

	public static void main(String[] args) {
		try {
//			Step 1 : load the Driver --- this will identify the which data base we are using it ...!
					Class.forName("com.mysql.cj.jdbc.Driver"); // this have inbuild logic to connect / hit to dabase 
					System.out.println("Driver Loded ");
					
//			Step 2 : Create the connection , ? where is ur DB  ? what is the username ? password ? 
//					jdbc:mysql://hostname/ databaseName
//					user name 
//					password 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
					System.out.println("Connection Created ");
//			Step 3 : Create the Steamtment : this is just to pass what we do on data base / insert  upadte / delete or 
					Statement stmt = con.createStatement();
//			Step 4 :  execute the Query 
					stmt.execute("insert into Employee values(111, 'Thanesh', 27 ,90000, 'Developer') ");
//			Step 5 :  Close the connection and statment 
						con.close();
						stmt.close();
						
						System.out.println("Data Inserted succssfully....!");
						
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
