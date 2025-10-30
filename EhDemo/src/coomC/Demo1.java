package coomC;

import java.util.Scanner;

class Emp {

	public void display() {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter Age ? ");
	int age= sc.nextInt();
	
	if(age > 60) {
//		throw new MaxAgeException("Hi Age must not be more the 60 ");
		throw new InvalidAgeException("Hi Age must not be more the 60 ");
	}
	else if(age< 18 ){
	
//		throw new MaxAgeException("Hi Age must not be more the 60 ");
		throw new InvalidAgeException("Hi Age must not be more the 60 ");
	}
	else if(age> 18 && age < 60){
		System.out.println("Fine to VOTE  ");
	}
	}
}
public class Demo1 {
	public static void main(String[] args) {
		try {
			Emp e = new Emp();
			e.display();
		}
//		catch (MinAgeException e) {
//				System.out.println(e.getMessage());
//		}
//		catch (MaxAgeException e) {
//			System.out.println(e.getMessage());
//		}
		catch (InvalidAgeException e) {
		System.out.println(e.getMessage());
	}
	}
}
class InvalidAgeException  extends RuntimeException
{
	InvalidAgeException(String msg){
		super(msg);
	}
}

//class MinAgeException  extends RuntimeException
//{
//	MinAgeException(String msg){
//		super(msg);
//	}
//}
//class MaxAgeException  extends RuntimeException
//{
//	MaxAgeException(String msg){
//		super(msg);
//	}
//}