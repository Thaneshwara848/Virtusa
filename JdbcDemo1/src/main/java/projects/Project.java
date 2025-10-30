package projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
class Emp{
	public static void insert() {	
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); // this have inbuild logic to connect / hit to dabase 
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Virtusa", "root", "root");
//			Statement stmt = con.createStatement();
//			stmt.execute("insert into Employee values(111, 'Thanesh', 27 ,90000, 'Developer') ");
	
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
	public static void display() {
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
	public static void update() {
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
	public static void delete() {
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
public class Project {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1 ) INSERT ");
			System.out.println("2 ) DISPLAY ");
			System.out.println("3 ) UPDATE");
			System.out.println("4 ) DELETE ");
			System.out.println("5 )  Exit ");
			ch=sc.nextInt();
			if(ch==1) {
				Emp.insert();
			}
			if(ch==2) {
				Emp.display();
			}
			if(ch==3) {
				Emp.update();
			}
			if(ch==4) {
				Emp.delete();
			}
			
		} while (ch!=4);
	}
}
