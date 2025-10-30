package comD;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
class A{
	public void display() throws InvalidAgeException, IOException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Age  :");	int age = sc.nextInt();
		if(age > 60) {
		
//			throw new InvalidAgeException("Age can not be more the 60 ");
//			throw new IOException("Hiiii Io ");		// yes ites check	 
//			throw new SQLException("Hiii");			// yes its a check 
			throw new NullPointerException("Hiiiii");		// no bcz its uncheck
		}
		else if(age <=18) {
			throw new InvalidAgeException("Age can not be less then 18"); 
		}
		else {
			System.out.println("My Age is  :" + age );
		}
	}
}
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
public class Emp {
	public static void main(String[] args) {
		try {
			A a = new A();
			a.display();
		} 
		catch (InvalidAgeException me) {
			System.out.println(me.getMessage());
		}
		catch (Exception e) {
		}
	}
}
//		throw 									throws 
//		it is used to raise a 					it is used to decalre the check expcetions 
//			exception manually 
//
//		one one raise at t time 				we can decalre multiple at a time
//		
//		this is inside the method 				this can be method declarition 



